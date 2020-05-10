package Player;

import Map.Map;

public class Player implements Runnable{

    String MapData;

    public Player() {
        int hp = 100;
    }

    @Override
    public void run() {
        MapData = Map.getMap().MapData;
        Map.getMap().setNumPlayers(Map.getMap().getNumPlayers()+1);
    }

    public String getMapData() {
        return MapData;
    }

}
