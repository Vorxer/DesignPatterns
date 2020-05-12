import java.util.ArrayList;

public class Player implements Cloneable{

    String Name;
    int hitPoints;
    int startingXCoordinate;
    int startingYCoordinate;
    ArrayList<String> Weapons = new ArrayList<>();

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStartingXCoordinate() {
        return startingXCoordinate;
    }

    public void setStartingXCoordinate(int startingXCoordinate) {
        this.startingXCoordinate = startingXCoordinate;
    }

    public int getStartingYCoordinate() {
        return startingYCoordinate;
    }

    public void setStartingYCoordinate(int startingYCoordinate) {
        this.startingYCoordinate = startingYCoordinate;
    }

    public ArrayList<String> getWeapons() {
        return Weapons;
    }

    public void setWeapons(ArrayList<String> weapons) {
        Weapons = weapons;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
