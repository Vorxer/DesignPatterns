package FiringPenalties;

import FiringData.FiringData;

public class ShortRangePenalty extends FiringPenaltyHandler{

    @Override
    public int calculateFiringPenalty(FiringData firingData) {
        if(firingData.getTargetRange() < firingData.getMaxRange()/3){
            return 0;
        }
        return successor.calculateFiringPenalty(firingData);
    }
}
