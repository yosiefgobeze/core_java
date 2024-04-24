package THREAD_DEMO;

public class ThreadNonSynchronized {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable a = () -> {
                for(int i = 0; i < 1000; i++){
                    c.increment();
                   // Thread.sleep(10); sleep(), wait() will take the thread to waiting state
                   
                }
        };

        Runnable b = () -> {
            for(int i = 0; i <1000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(a); // New state -- here thread is said to be in new state
        Thread t2 = new Thread(b);
        
        System.out.println("before thread count: " + c.count);

        t1.start(); // the new thread object is calling start() and makes it in runnable state
        t2.start(); // start() method will call the run() and makes it in running state
       // t1.notify(); // notify() method will bring thread from wait to runnable
       // stop() method will kill the thread and makes it in dead state

        t1.join();
        t2.join();
        // the join is used for the threads to complete their operations before main starts
        // the above operation is expected to make balance to 2000, because both threads are incrementing 1000 times.
        // but in non synchronous threads might not get the right result
        System.out.println("after thread count: " + c.count);
    }
}

class Counter{
    int count;
    public void increment(){
        count++;
    }
}


