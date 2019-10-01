package evolution.of.truth.agent;

import evolution.of.truth.Match;

public class Devil extends Agent {
    public Devil() {
        super("Devil");
    }
    @Override
    public int choice(int previousOpponentChoice) {
        return Match.CHEAT;
    }
}
