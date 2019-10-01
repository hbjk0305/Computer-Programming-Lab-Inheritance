package evolution.of.truth.agent;

import evolution.of.truth.Match;

public class Angel extends Agent {
    @Override
    public int choice() {
        return Match.COOPERATE;
    }
}
