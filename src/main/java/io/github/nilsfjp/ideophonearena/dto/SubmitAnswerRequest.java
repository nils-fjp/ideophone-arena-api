package io.github.nilsfjp.ideophonearena.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class SubmitAnswerRequest {

    @NotNull
    @Positive
    private Long roundId;

    @NotNull
    @Positive
    private Long selectedIdeophoneId;

    @NotNull
    @Min(0)
    @Max(600000)
    private Integer responseTimeMs;

    public Long getRoundId() {
        return roundId;
    }

    public void setRoundId(Long roundId) {
        this.roundId = roundId;
    }

    public Long getSelectedIdeophoneId() {
        return selectedIdeophoneId;
    }

    public void setSelectedIdeophoneId(Long selectedIdeophoneId) {
        this.selectedIdeophoneId = selectedIdeophoneId;
    }

    public Integer getResponseTimeMs() {
        return responseTimeMs;
    }

    public void setResponseTimeMs(Integer responseTimeMs) {
        this.responseTimeMs = responseTimeMs;
    }
}
