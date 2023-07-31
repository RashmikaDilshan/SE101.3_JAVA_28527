package Lab8;

public class SavingsAccount extends Bankaccount{
    
    @Override
    public void calculateInterest(){
        //inteest=12%
        
        int value=getbalance();
        int interest= (int) (value * 0.12);
        System.out.println("the interest of the savingas account is  "+interest);
    }
}

