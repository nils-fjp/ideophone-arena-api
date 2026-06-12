package io.github.nilsfjp.ideophonearena.repository;

public interface LeaderboardEntryProjection {

    String getUsername();

    Long getBestSessionCorrect();

    Long getBestSessionAnswered();
}
