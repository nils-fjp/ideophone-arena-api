package io.github.nilsfjp.ideophonearena.dto;

public class LeaderboardEntryResponse {

    private String username;
    private long bestSessionCorrect;
    private long bestSessionAnswered;
    private double bestSessionAccuracy;

    public LeaderboardEntryResponse(String username, long bestSessionCorrect, long bestSessionAnswered,
            double bestSessionAccuracy) {
        this.username = username;
        this.bestSessionCorrect = bestSessionCorrect;
        this.bestSessionAnswered = bestSessionAnswered;
        this.bestSessionAccuracy = bestSessionAccuracy;
    }

    public String getUsername() {
        return username;
    }

    public long getBestSessionCorrect() {
        return bestSessionCorrect;
    }

    public long getBestSessionAnswered() {
        return bestSessionAnswered;
    }

    public double getBestSessionAccuracy() {
        return bestSessionAccuracy;
    }
}
