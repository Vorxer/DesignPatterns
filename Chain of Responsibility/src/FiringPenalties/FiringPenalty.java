package FiringPenalties;

import FiringData.FiringData;

public class FiringPenalty  extends FiringPenaltyHandler{

    @Override
    public int calculateFiringPenalty(FiringData firingData) {
        return successor.calculateFiringPenalty(firingData);
    }
}
