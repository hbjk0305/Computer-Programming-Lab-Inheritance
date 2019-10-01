package evolution.of.truth.agent;

import evolution.of.truth.match.Match;

public class Copycat extends Agent {
    public Copycat() {
        super("Copycat");
    }

    @Override
    public int choice(int previousOpponentChoice) {
        if (previousOpponentChoice == Match.UNDEFINED) {
            return Match.COOPERATE;
        } else {
            return previousOpponentChoice;
        }
    }
}
