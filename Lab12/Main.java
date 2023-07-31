package Lab12;

public class Main {
    public static void main(String[] args) {
     
        RedLightThread thread1    =new RedLightThread();
        GreenLightTHread thread2  =new GreenLightTHread();
        YellowLightThread thread3 =new YellowLightThread(); 
        thread1.start();
        thread2.start();
        thread3.start();
       
}
}