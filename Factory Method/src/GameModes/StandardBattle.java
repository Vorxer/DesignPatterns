package GameModes;

import VictoryConditions.Domination;
import VictoryConditions.ScoreVictory;

public class StandardBattle extends GameMode{
    @Override
    public void createGameMode() {
        this.startingConditions = "STANDARD ECONOMY - BALANCED START POSITIONS";
        VictoryConditions.add(new Domination());
        VictoryConditions.add(new ScoreVictory());
    }
}
