package evolution.of.truth;

public class Agent {
    private int score;

    public Agent() {
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        score = newScore;
    }

    public int choice() {
        return Match.COOPERATE;
    }
}
