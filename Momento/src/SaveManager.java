import java.util.Stack;

public class SaveManager {

    Stack<GameState.GameHistory> gameHistory = new Stack<>();

    public void save(GameState gameState){
        gameHistory.push(gameState.save());
    }

    public void revert(GameState gameState){
        if(!gameHistory.isEmpty())
            gameState.revert(gameHistory.pop());
        else
            System.out.println("Unable to revert");
    }
}
