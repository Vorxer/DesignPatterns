package GameModes;

import VictoryConditions.Domination;
import VictoryConditions.ScoreVictory;
import VictoryConditions.SpecialVictory;

public class CaptureTheFlag extends GameMode{
    @Override
    public void createGameMode() {
        this.startingConditions = "MEDIUM ECONOMY: SYMMETRICAL STARTING POSITIONS";
        VictoryConditions.add(new Domination());
        VictoryConditions.add(new ScoreVictory());
        VictoryConditions.add(new SpecialVictory());
    }

}
