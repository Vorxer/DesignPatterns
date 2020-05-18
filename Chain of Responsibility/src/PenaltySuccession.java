import FiringPenalties.FiringPenalty;

public abstract class PenaltySuccession {
    FiringPenalty firingPenalty = new FiringPenalty();

    public FiringPenalty getFiringPenalty() {
        return firingPenalty;
    }
}
