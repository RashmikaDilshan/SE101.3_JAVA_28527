package Lab12;

public class RedLightThread extends Thread{
       
    @Override
    public void run(){
    try  {
        Thread.sleep(5000);
         System.out.println("red color");
    }
    catch (InterruptedException e) {
        
    }
    }

    
}
