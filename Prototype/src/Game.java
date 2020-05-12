public class Game {

    public static void main(String[] args) {
        Server server= new Server();

        Player player1 = server.getNewPlayer();
        Player player2 = server.getNewPlayer();
        Player player3 = server.getNewPlayer();

        player1.setName("TheMyth27");
        player2.setName("TheMightyCaptain");
        player3.setName("JohnPaulJones");

        System.out.println("Player 1 : " + player1.getName());
        System.out.println("Player 2 : " + player2.getName());
        System.out.println("Player 3 : " + player3.getName());
    }



}
