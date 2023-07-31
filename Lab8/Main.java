package Lab8;

public class Main {
    public static void main(String[] args) {
       SavingsAccount obj=new SavingsAccount();
       obj.setbalance(20000000);
       obj.calculateInterest();
       
       CheckingAccount obk=new CheckingAccount();
       obk.setbalance(1000000);
       obk.calculateInterest();
        
    }
}

