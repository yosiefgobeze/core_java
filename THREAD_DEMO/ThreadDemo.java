package THREAD_DEMO;

public class ThreadDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        // every thread can have a priority between 1 - 10
        // a.setPriority(8);
        // b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            System.out.println("Exception message: " + e);
        } 
        b.start();
    }
}
class A extends Thread{
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("Yohana...");
            // try {
            //     Thread.sleep(100);
            // } catch (InterruptedException e) {
            //     System.out.println("Exception message: " + e);
            // }           
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 1000; i >= 0; i--){
            System.out.println("...Teweldemedhn");
            // try{
            //     Thread.sleep(100);
            // }catch(InterruptedException e){
            //     System.out.println("Exception message: " + e);
            // }
    }   
}
}
