package THREAD_DEMO;

public class RunnableLambda {
    public static void main(String[] args) {

        // use anonymous class then convert it to lambda 
        // Runnable r1 = new Runnable() {
        //     public void run(){
        //         for(int i = 0; i < 10; i++){
        //             System.out.println("Eat.....");
        //             try{
        //                 Thread.sleep(10);
        //             }catch(InterruptedException e){
        //                 System.out.println("Sleeping error ..." + e);
        //             }
        //         }
        //     }
        // }; 

        Runnable r1 = () ->{
                for(int i = 0; i < 10; i++){
                    System.out.println("Eat.....");
                    try{
                        Thread.sleep(10);
                    }catch(InterruptedException e){
                        System.out.println("Sleeping error ..." + e);
                    }
                }
            };
     
        Runnable r2 = new Drink();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Sleeping error ..." + e);
        }
        t2.start();


    }    
}

// Runnable is a functional interface
// for a functional interface we might not need to implement it using a separate class
class Eat implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Eat.....");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println("Sleeping error ..." + e);
            }
        }
    }
}

class Drink implements Runnable{
    public void run(){
        for(int i = 10; i > 0; i--){
            System.out.println(".....Drink");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println("Sleeping error ..." + e);
            }
        }
    }
}
