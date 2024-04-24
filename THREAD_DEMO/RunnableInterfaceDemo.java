package THREAD_DEMO;

public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        Runnable b = new B();
        Runnable c = new C();

        Thread bt = new Thread(b);
        Thread ct = new Thread(c);

        bt.start();
        ct.start();

    }
}

class A{
    public void commonMethod(){
        System.out.println("All other child classes can use this.....");
    }
}

class B extends A implements Runnable{

    @Override
    public void run() {
        
        for(int i = 0; i < 10; i++){
            System.out.println("Yohana .....");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println("Exception message: " + e);
            }
        }
    }   
}

class C extends A implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println("..... Teweldemedhn");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println("Exception message: " + e);
            }
        }
    }
    
}
