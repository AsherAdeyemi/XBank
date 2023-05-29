package XBank;

public class Savings extends Current{

    public float WithdrawalS(float amount){
        if(amount > 20000){
            return 0;
        }else{return WithdrawalC(amount);}
    }
    public float DepositS(float amount){
        return DepositC(amount);
    }
}
