package Lab12;

public class YellowLightThread extends Thread{
   
 @Override
 public void run(){
    try {
        Thread.sleep(2000);
        System.out.println("yellow color");
    }
    catch (InterruptedException e) {
         
    }
    }    

   
}
