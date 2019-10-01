package evolution.of.truth.agent;

abstract public class Agent {
    private int score;
    private String name;

    protected Agent(String name) {
        score = 0;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + getScore();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        score = newScore;
    }

    abstract public int choice(int previousOpponentChoice);
}
