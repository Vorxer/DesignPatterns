package FiringData;

public class FiringData {

    int maxRange;
    int targetRange;
    Boolean rangeExtensionOn;
    int rangeExtensionPercent;

    public FiringData(Builder builder) {
        this.maxRange = builder.maxRange;
        this.targetRange = builder.targetRange;
        this.rangeExtensionOn = builder.rangeExtensionOn;
        this.rangeExtensionPercent = builder.rangeExtensionPercent;
    }

    public static class Builder{
        int maxRange;
        int targetRange;
        Boolean rangeExtensionOn;
        int rangeExtensionPercent;

        public FiringData build(){
            return new FiringData(this);
        }

        public Builder(int maxRange, int targetRange) {
            this.maxRange = maxRange;
            this.targetRange = targetRange;
        }


        public Builder rangeExtensionOn(Boolean rangeExtensionOn){
            this.rangeExtensionOn = rangeExtensionOn;
            return this;
        }

        public Builder rangeExtensionPercent(int rangeExtensionPercent){
            this.rangeExtensionPercent = rangeExtensionPercent;
            return this;
        }

    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getTargetRange() {
        return targetRange;
    }

    public Boolean getRangeExtensionOn() {
        return rangeExtensionOn;
    }

    public int getRangeExtensionPercent() {
        return rangeExtensionPercent;
    }
}
