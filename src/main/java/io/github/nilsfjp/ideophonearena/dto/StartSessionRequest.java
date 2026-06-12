package io.github.nilsfjp.ideophonearena.dto;

import io.github.nilsfjp.ideophonearena.model.enums.ConditionName;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class StartSessionRequest {

    @NotNull
    @Positive
    private Integer difficultyLevel;

    @NotNull
    private ConditionName conditionName;

    private boolean includePractice;

    public Integer getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(Integer difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public ConditionName getConditionName() {
        return conditionName;
    }

    public void setConditionName(ConditionName conditionName) {
        this.conditionName = conditionName;
    }

    public boolean isIncludePractice() {
        return includePractice;
    }

    public void setIncludePractice(boolean includePractice) {
        this.includePractice = includePractice;
    }
}
