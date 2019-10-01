import evolution.of.truth.agent.Agent;
import evolution.of.truth.Match;
import evolution.of.truth.agent.Angel;
import evolution.of.truth.agent.Devil;

public class Main {
    public static void main(String args[]) {
        Agent agentA = new Angel();
        Agent agentB = new Devil();
        Match.playGame(agentA, agentB);
        System.out.println(agentA.getScore());
        System.out.println(agentB.getScore());
    }
}
