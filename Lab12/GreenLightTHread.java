package Lab12;

public class GreenLightTHread extends Thread {

    @Override
    public void run(){
    try {
        Thread.sleep(10000);
        System.out.println("green color");
    }
    catch (InterruptedException e) {
         
    }
    } 

    
}