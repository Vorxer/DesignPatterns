public class Game {
    public static void main(String[] args) {
        SaveManager saveManager = new SaveManager();
        GameState gameState =new GameState();

        gameState.addPlayer(new Player("Shokaku"));
        saveManager.save(gameState);
        System.out.println(gameState);

        gameState.addPlayer(new Player("Nagara"));
        saveManager.save(gameState);
        System.out.println(gameState);

        gameState.addPlayer(new Player("Izumo"));
        saveManager.save(gameState);
        System.out.println(gameState);

        saveManager.revert(gameState);
        saveManager.revert(gameState);
        System.out.println(gameState);

        saveManager.revert(gameState);
        System.out.println(gameState);

        saveManager.revert(gameState);
        System.out.println(gameState);
    }
}