package io.github.nilsfjp.ideophonearena.dto;

public class AnswerResultResponse {

    private Long roundId;
    private Long selectedIdeophoneId;
    private Long correctIdeophoneId;
    private boolean correct;
    private boolean practice;
    private String targetTranslation;
    private String correctKana;
    private String selectedKana;
    private long totalAnswered;
    private long totalCorrect;

    public AnswerResultResponse(Long roundId, Long selectedIdeophoneId, Long correctIdeophoneId, boolean correct,
            boolean practice, String targetTranslation, String correctKana, String selectedKana, long totalAnswered,
            long totalCorrect) {
        this.roundId = roundId;
        this.selectedIdeophoneId = selectedIdeophoneId;
        this.correctIdeophoneId = correctIdeophoneId;
        this.correct = correct;
        this.practice = practice;
        this.targetTranslation = targetTranslation;
        this.correctKana = correctKana;
        this.selectedKana = selectedKana;
        this.totalAnswered = totalAnswered;
        this.totalCorrect = totalCorrect;
    }

    public Long getRoundId() {
        return roundId;
    }

    public Long getSelectedIdeophoneId() {
        return selectedIdeophoneId;
    }

    public Long getCorrectIdeophoneId() {
        return correctIdeophoneId;
    }

    public boolean isCorrect() {
        return correct;
    }

    public boolean isPractice() {
        return practice;
    }

    public String getTargetTranslation() {
        return targetTranslation;
    }

    public String getPrompt() {
        return targetTranslation;
    }

    public String getCorrectKana() {
        return correctKana;
    }

    public String getSelectedKana() {
        return selectedKana;
    }

    public long getTotalAnswered() {
        return totalAnswered;
    }

    public long getTotalCorrect() {
        return totalCorrect;
    }
}
