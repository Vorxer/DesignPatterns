package FiringPenalties;

import FiringData.FiringData;

public class LongRangeFiringPenalty extends FiringPenaltyHandler{

    @Override
    public int calculateFiringPenalty(FiringData firingData) {
        if(!firingData.getRangeExtensionOn()){
            return 20;
        }
        return successor.calculateFiringPenalty(firingData);
    }
}