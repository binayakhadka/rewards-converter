public class RewardValue {

    double cashValue;
    int milesValue;
    double conversionRate = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue/conversionRate);
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue*conversionRate;
    }
    public double getMilesValue(){

        return milesValue;
    }
    public double getCashValue(){
        return cashValue;
    }
}
