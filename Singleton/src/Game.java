import Map.Map;
import Player.Player;

public class Game {

    public static void main(String[] args) throws Exception{
        //Set the MapData Attribute of the singleton
        Map.getMap().setMapData("Black Forest: 2 Player Deathmatch");

        //Print the Number of players before adding any players
        System.out.println("Number of Players = " + Map.getMap().NumPlayers);

        //player 1 is created and run.
        Player player1 = new Player();
        Thread player1thread = new Thread(player1);
        player1thread.run();
        Thread.sleep(2000);

        //Print the number of player again. This time it will have increased as the player
        //has been initialised
        System.out.println("Player 1 Added");
        System.out.println("Number of Players = " + Map.getMap().NumPlayers);

        //player 2 is created and run.
        Player player2 = new Player();
        Thread player2thread = new Thread(player2);
        player2thread.run();
        Thread.sleep(2000);

        //Repeat with Player 2
        System.out.println("Player 2 Added");
        System.out.println("Number of Players = " + Map.getMap().NumPlayers);

        //Both Players access common MapData from common Map Object
        System.out.println("p1 Map Info" + player1.getMapData());
        System.out.println("p2 Map Info" + player2.getMapData());

    }

}
