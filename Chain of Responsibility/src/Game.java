import FiringData.FiringData;

public class Game {

    public static void main(String[] args) {

        //This demonstrates how chain of responsibly can be used to calculate a penalty on weapons firing accuracy
        //In a video game, depending on how far the target is;

        //Firing Data holds information pertaining to the shot fired.
        //The maximum range of the weapon and the distance to the target is set here
        FiringData.Builder builder = new FiringData.Builder(35,34);
        builder.rangeExtensionOn(true).rangeExtensionPercent(10);
        FiringData firingData = new FiringData(builder);


        //A standard sequence of succession is created here. The StandardPenaltySuccession class holds the Chain
        //of Succession

        PenaltySuccession penaltySuccession =new StandardPenaltySuccession();

        System.out.println(penaltySuccession.getFiringPenalty().calculateFiringPenalty(firingData));
    }

}
