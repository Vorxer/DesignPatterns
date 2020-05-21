import java.util.ArrayList;

public class GameState {

    ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(Player player){
        players.add(player);
    }

    public void setPlayer(ArrayList<Player> player){
        this.players = (ArrayList<Player>) players.clone();
    }

    static class GameHistory{
        ArrayList<Player> players;

        public GameHistory(ArrayList<Player> players) {
            this.players = players;
        }

        public ArrayList<Player> getPlayers() {
            return players;
        }
    }

}
