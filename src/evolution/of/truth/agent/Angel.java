package evolution.of.truth.agent;

import evolution.of.truth.match.Match;

public class Angel extends Agent {
    public Angel() {
        super("Angel");
    }
    @Override
    public int choice(int previousOpponentChoice) {
        return Match.COOPERATE;
    }
}
