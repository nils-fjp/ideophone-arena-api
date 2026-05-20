CREATE DATABASE IF NOT EXISTS ideophone_arena
    DEFAULT CHARACTER SET utf8mb4;

USE ideophone_arena;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS player_answers;
DROP TABLE IF EXISTS game_sessions;
DROP TABLE IF EXISTS arena_rounds;
DROP TABLE IF EXISTS ideophones;
DROP TABLE IF EXISTS app_users;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE app_users (
    id BIGINT NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL
        UNIQUE,
    email VARCHAR(255) NOT NULL
        UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL DEFAULT 'ROLE_USER',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE ideophones (
    id BIGINT NOT NULL AUTO_INCREMENT,
    kana VARCHAR(50) NOT NULL
        UNIQUE,
    romaji VARCHAR(100) NOT NULL,
    gloss VARCHAR(255) NOT NULL,
    canonical_script VARCHAR(20) NOT NULL,
    modality VARCHAR(50),

    PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE arena_rounds (
    id BIGINT NOT NULL AUTO_INCREMENT,
    prompt VARCHAR(255) NOT NULL,
    left_ideophone_id BIGINT NOT NULL,
    right_ideophone_id BIGINT NOT NULL,
    correct_ideophone_id BIGINT NOT NULL,
    condition_name VARCHAR(50) NOT NULL DEFAULT 'TEXT_ONLY',
    difficulty_level INT NOT NULL DEFAULT 1,

    PRIMARY KEY (id),

    CONSTRAINT fk_round_left_ideophone
        FOREIGN KEY (left_ideophone_id)
            REFERENCES ideophones (id),

    CONSTRAINT fk_round_right_ideophone
        FOREIGN KEY (right_ideophone_id)
            REFERENCES ideophones (id),

    CONSTRAINT fk_round_correct_ideophone
        FOREIGN KEY (correct_ideophone_id)
            REFERENCES ideophones (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE game_sessions (
    id BIGINT NOT NULL AUTO_INCREMENT,
    session_uuid CHAR(36) NOT NULL
        UNIQUE,
    user_id BIGINT NOT NULL,
    difficulty_level INT NOT NULL DEFAULT 1,
    condition_name VARCHAR(50) NOT NULL DEFAULT 'TEXT_ONLY',
    started_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    completed_at TIMESTAMP NULL,

    PRIMARY KEY (id),

    CONSTRAINT fk_game_sessions_user
        FOREIGN KEY (user_id)
            REFERENCES app_users (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE player_answers (
    id BIGINT NOT NULL AUTO_INCREMENT,
    session_id BIGINT NOT NULL,
    round_id BIGINT NOT NULL,
    selected_ideophone_id BIGINT NOT NULL,
    is_correct BOOLEAN NOT NULL,
    response_time_ms INT,
    answered_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (id),
    UNIQUE (session_id, round_id),

    CONSTRAINT fk_answers_session
        FOREIGN KEY (session_id)
            REFERENCES game_sessions (id),

    CONSTRAINT fk_answers_round
        FOREIGN KEY (round_id)
            REFERENCES arena_rounds (id),

    CONSTRAINT fk_answers_selected_ideophone
        FOREIGN KEY (selected_ideophone_id)
            REFERENCES ideophones (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;
