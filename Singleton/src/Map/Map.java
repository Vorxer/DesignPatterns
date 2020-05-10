package Map;

public class Map {

    public static volatile Map map = new Map();

    public String MapData = "";
    public int NumPlayers = 0;
    public String MissionData = "";

    private Map(){
        if (map != null){
            throw new RuntimeException("unauthorised. Use getMap method");
        }
    }

    public static Map getMap(){

        if(map == null){
            synchronized (Map.class){
                if(map == null){
                    map = new Map();
                }
            }
        }

        return map;
    }

    public String getMapData() {
        return MapData;
    }

    public void setMapData(String mapData) {
        MapData = mapData;
    }

    public int getNumPlayers() {
        return NumPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        NumPlayers = numPlayers;
    }

    public String getMissionData() {
        return MissionData;
    }

    public void setMissionData(String missionData) {
        MissionData = missionData;
    }
}
