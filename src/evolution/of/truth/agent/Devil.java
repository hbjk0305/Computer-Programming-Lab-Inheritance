package evolution.of.truth.agent;

import evolution.of.truth.Match;

public class Devil extends Agent {
    @Override
    public int choice() {
        return Match.CHEAT;
    }
}
