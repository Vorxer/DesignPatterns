import java.util.ArrayList;
import java.util.Random;

public class Server {

    Player dummyplayer;
    Random random = new Random();

    public Server(){
        initialise();
    }

    public void initialise(){
        dummyplayer = new Player();
        dummyplayer.setName("");
        dummyplayer.setHitPoints(100);
        dummyplayer.setStartingXCoordinate(0);
        dummyplayer.setStartingYCoordinate(0);
        ArrayList<String> Weapons = new ArrayList<String>();
        Weapons.add("Knife");
        Weapons.add("Pistol");
        dummyplayer.setWeapons(Weapons);
    }

    public Player getNewPlayer(){
        try {
            return (Player)dummyplayer.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

}
