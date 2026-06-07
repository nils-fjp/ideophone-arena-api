# Phase 2 API Plan

Date: 2026-06-07

## Purpose

This note records backend extension points for Phase 2 game modes without committing to schema changes yet. The current
MVP API remains the source of truth until a later implementation pass updates the contract and tests.

## Current boundary

`POST /api/game/sessions` remains the only session-start endpoint.

Externally selectable session settings are deliberately narrow:

```text
conditionName: CONDITION_1_SOKUON | CONDITION_2_SOKUON | CONDITION_3_SOKUON
difficultyLevel: 1
```

`TEXT_ONLY` remains an internal enum value for legacy/test data paths and is not a playable external mode.

## Future extension points

`GameMode` should represent the rule system for a session. Likely values later include choosing, Script Lab, Modality
Ladder, and Rating Lab. Do not add it to the request body until there is a tested backend behavior difference.

`PresentationMode` should represent how the same lexical/round data is shown: audio-only, script match, script mismatch,
placeholder, context sentence, or rating view. Today the three supported `conditionName` values are enough for Script Lab.

`RoundTemplate` should become the durable source for pairings, correct ideophone, foil type, modality, route, difficulty,
and source metadata. Today `ArenaRound` is still the active MVP round model.

`StimulusAsset` should separate canonical audio, generated images, generated videos, and source paths from the ideophone
itself. Today `Ideophone.stimulusFile` plus `/stimuli/**` is the active MVP asset contract.

`RatingAttempt` should be separate from `PlayerAnswer`. Choosing-task answers and reflective Likert ratings measure
different behavior and should not be mixed in the same table or score logic.

## Non-goals for this pass

Do not add campaign mode, rating mode, artificial foils, deck/card mechanics, Flyway/Liquibase, Docker, CI, or new
endpoint paths in this readiness pass.

## Migration direction

The next backend mode pass should add only one optional concept at a time, with DTO validation, service-layer validation,
MockMvc coverage, and an updated `docs/backend-contract.md`. Prefer extending the session-start request only when the
new field changes server behavior; otherwise keep mode labels and presentation choices in the frontend.
