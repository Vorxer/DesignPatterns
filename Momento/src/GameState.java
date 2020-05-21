import java.util.ArrayList;

public class GameState {

    ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(Player player){
        players.add(player);
    }

    public void setPlayer(ArrayList<Player> player){
        this.players = (ArrayList<Player>) players.clone();
    }

    public ArrayList<Player> getPlayers() {
        return (ArrayList<Player>)players.clone();
    }

    public GameHistory save(){
       return new GameHistory(getPlayers());
    }

    public void revert(GameHistory gameHistory){
        this.players = gameHistory.getPlayers();
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

    @Override
    public String toString() {
        return "GameState{" +
                "players=" + players +
                '}';
    }
}
