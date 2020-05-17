public class Game {
    public static void main(String[] args) {

        Player.Builder builder = new Player.Builder("Hera");

        Player player = builder.level(24).skin("Desert-Camouflage").item("Health-Potion").build();

        System.out.println(player.toString());
    }
}
