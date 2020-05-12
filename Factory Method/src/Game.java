import GameModes.GameMode;
import GameModes.GameModeFactory;

public class Game {
    public static void main(String[] args) {

        GameMode game1 = GameModeFactory.generateGame("standard");

        System.out.println(game1.getDetails());

        GameMode game2 = GameModeFactory.generateGame("deathmatch");

        System.out.println(game2.getDetails());

        GameMode game3 = GameModeFactory.generateGame("capturetheflag");

        System.out.println(game3.getDetails());

    }
}
