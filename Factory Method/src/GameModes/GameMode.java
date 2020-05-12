package GameModes;

import VictoryConditions.VictoryCondition;

import java.util.ArrayList;

public abstract class GameMode {

    String startingConditions;

    public ArrayList<VictoryCondition> VictoryConditions = new ArrayList<>();

    public GameMode() {
        createGameMode();
    }

    public abstract void createGameMode();

    public String getDetails() {
        String details = "Game Details: \nStarting Position : " + startingConditions + "\n Victory Conditions: \n";
        for (VictoryCondition vc : VictoryConditions){
            details = details + "-> " + vc.getDescription() + "\n";
        }

        return details + "\n";
    }

}
