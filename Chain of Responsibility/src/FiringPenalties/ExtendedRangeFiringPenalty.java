package FiringPenalties;

import FiringData.FiringData;

public class ExtendedRangeFiringPenalty  extends FiringPenaltyHandler{

    @Override
    public int calculateFiringPenalty(FiringData firingData) {
        if(firingData.getRangeExtensionOn()){
            return 25;
        }
        return successor.calculateFiringPenalty(firingData);
    }
}