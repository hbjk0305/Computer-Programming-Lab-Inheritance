package evolution.of.truth.agent;

import evolution.of.truth.Match;

public class Copycat extends Agent {
    @Override
    public int choice(int previousOpponentChoice) {
        if (previousOpponentChoice == Match.UNDEFINED) {
            return Match.COOPERATE;
        } else {
            return previousOpponentChoice;
        }
    }
}
