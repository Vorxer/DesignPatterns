package FiringPenalties;

import FiringData.FiringData;

public class MediumRangeFiringPenalty extends FiringPenaltyHandler{

    @Override
    public int calculateFiringPenalty(FiringData firingData) {
        if(firingData.getTargetRange() < firingData.getMaxRange()* 2/3){
            return 10;
        }
        return successor.calculateFiringPenalty(firingData);
    }
}
