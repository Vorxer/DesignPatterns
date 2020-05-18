package FiringPenalties;

import FiringData.FiringData;

public abstract class FiringPenaltyHandler {

    protected FiringPenaltyHandler successor;

    public abstract int calculateFiringPenalty(FiringData firingData);

    public void setSuccessor(FiringPenaltyHandler successor){
        this.successor = successor;
    }

}
