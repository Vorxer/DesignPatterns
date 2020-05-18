import FiringPenalties.*;

public class StandardPenaltySuccession extends PenaltySuccession {

    ShortRangePenalty shortRangePenalty = new ShortRangePenalty();
    MediumRangeFiringPenalty mediumRangeFiringPenalty = new MediumRangeFiringPenalty();
    LongRangeFiringPenalty longRangeFiringPenalty = new LongRangeFiringPenalty();
    ExtendedRangeFiringPenalty extendedRangeFiringPenalty = new ExtendedRangeFiringPenalty();

    public StandardPenaltySuccession() {
        firingPenalty.setSuccessor(shortRangePenalty);
        shortRangePenalty.setSuccessor(mediumRangeFiringPenalty);
        mediumRangeFiringPenalty.setSuccessor(longRangeFiringPenalty);
        longRangeFiringPenalty.setSuccessor(extendedRangeFiringPenalty);
    }
}
