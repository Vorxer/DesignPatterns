package GameModes;

import VictoryConditions.Domination;

public class Deathmatch extends GameMode{

    @Override
    public void createGameMode() {
        this.startingConditions = "HIGH ECONOMY - RANDOM START POSITIONS";
        VictoryConditions.add(new Domination());
    }

}
