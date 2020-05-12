package GameModes;

public class GameModeFactory {

    public static GameMode generateGame(String Mode){
        if (Mode == "standard")
            return new StandardBattle();

        else if (Mode == "deathmatch")
            return new Deathmatch();

        else if (Mode == "capturetheflag")
            return new CaptureTheFlag();

        return new StandardBattle();
    }
}
