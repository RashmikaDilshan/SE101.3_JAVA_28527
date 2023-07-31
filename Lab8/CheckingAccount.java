package Lab8;

public class CheckingAccount extends Bankaccount {
    
        public void calculateInterest(){
        //inteest=12%
      
        int value=getbalance();
        int interest= (int) (value * 0.02);
        System.out.println("the interest of the Cheaking account is  "+interest);
    }
        //interest=2%
        //what will be the interest for a person eith 1 millinon in his chesking account   and 20 millon in his  savings account 
}
