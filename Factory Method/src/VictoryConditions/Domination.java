package VictoryConditions;

import GameModes.GameMode;

public class Domination implements VictoryCondition {
    @Override
    public String getDescription() {
        return "All Specified Opponents Defeated";
    }
}