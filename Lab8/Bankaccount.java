package Lab8;

abstract class Bankaccount {
    private int accountNumber;
   private  int balance;
    
    public void setaccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getaccountNumber(){
        return accountNumber;
    }
    public void setbalance(int balance){
        this.balance=balance;
    }
    public int getbalance(){
        return balance;
    }
    
    abstract void calculateInterest();
        
    
}

