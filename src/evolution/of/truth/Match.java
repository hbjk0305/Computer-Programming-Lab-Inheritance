package evolution.of.truth;

import evolution.of.truth.agent.Agent;

public class Match {
    public static int CHEAT = 0;
    public static int COOPERATE = 1;

    private static int ruleMatrix[][][] = {
            {
                    {0, 0}, // A cheats, B cheats
                    {3, -1} // A cheats, B cooperates
            },
            {
                    {-1, 3}, // A cooperates, B cheats
                    {2, 2} // A cooperates, B cooperates
            }
    };

    public static void playGame(Agent agentA, Agent agentB) {
        int choiceA = agentA.choice();
        int choiceB = agentB.choice();
        agentA.setScore(agentA.getScore() + ruleMatrix[choiceA][choiceB][0]);
        agentB.setScore(agentB.getScore() + ruleMatrix[choiceA][choiceB][1]);
    }
}
