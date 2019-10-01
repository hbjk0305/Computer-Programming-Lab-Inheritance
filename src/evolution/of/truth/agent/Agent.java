package evolution.of.truth.agent;

abstract public class Agent {
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

    abstract public int choice();
}
