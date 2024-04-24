package THREAD_DEMO;

public class WithOutThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        try {
            Thread.sleep(1000); // processor will wait before doing the other task
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
        b.start();
    }
}

class A extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Drinking...: " + (i + i));
            try {
                Thread.sleep(1000); // processor will wait before doing the other task
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 100; i >= 0; i--){
            System.out.println("...Eating: " + (i + i));
            try {
                Thread.sleep(1000); // processor will wait before doing the other task
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }
        }
    }
}
