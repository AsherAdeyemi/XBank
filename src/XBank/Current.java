package XBank;

public class Current {
    public float Balance = 1000000;
    public float WithdrawalC(float amount){
        Balance -= amount;
        return Balance;
    }
    public float DepositC(float amount){
        Balance += amount;
        return Balance;
    }
}