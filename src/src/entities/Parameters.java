package entities;

public class Parameters {
    private int currencyGlucose;
    private int minimum;
    private int maximum;

    public Parameters(int maximum,int minimum){
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public void setCurrencyGlucose(int currencyGlucose) {
        this.currencyGlucose = currencyGlucose;
    }

}
