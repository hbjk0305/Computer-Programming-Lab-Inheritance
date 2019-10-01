import evolution.of.truth.agent.Agent;
import evolution.of.truth.Match;
import evolution.of.truth.agent.Angel;
import evolution.of.truth.agent.Copycat;
import evolution.of.truth.agent.Devil;

public class Main {
    public static void main(String args[]) {
        Agent agentA = new Copycat();
        Agent agentB = new Devil();
        Match match = new Match(agentA, agentB);
        match.playGame();
        match.playGame();
        match.playGame();
        match.playGame();
        match.playGame();
        System.out.println(agentA.getScore());
        System.out.println(agentB.getScore());
    }
}
