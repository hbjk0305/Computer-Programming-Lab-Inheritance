import evolution.of.truth.agent.Agent;
import evolution.of.truth.environment.Tournament;
import evolution.of.truth.match.Match;
import evolution.of.truth.agent.Copycat;
import evolution.of.truth.agent.Devil;

public class Main {
    public static void main(String args[]) {
        Tournament tournament = new Tournament();
        tournament.playAllGames(10);
        tournament.describe();
    }
}
