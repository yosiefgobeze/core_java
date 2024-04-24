package THREAD_DEMO;

/*
 * Biggest issue with threads is the occurance of change similtanously which can cause mutation problems
 * E.g imagine you have one bank account with two debit cards for A and B, account has 1000 balance, 
 * if A and B want to withdraw 600 each at exactly same time, a 1200 total will be withdrawn which is a big logical error
 * Thread safe, means only one thread can operate at a time
 */
public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {

        BankAccount bc = new BankAccount();
        Runnable a = () -> {
                bc.withdrawMoney(700);
            };

        Runnable b = () -> {
                bc.withdrawMoney(700);
            };

        System.out.println("Balance before withdrawal: " + bc.balance);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Balance after withdrawal: " + bc.balance);
    }
}

class BankAccount{
    int balance = 1000;
    // add synchronize to make the method thread safe which means only one thread will operate at a time.
    public synchronized void withdrawMoney(int amountToWithdraw){
        this.balance = balance - amountToWithdraw;
        // commented if case below will prevent logical error even though the method is not thread safe, to avoid this use Synchronized
        // if (balance == 1000) {
        //     this.balance = balance - amountToWithdraw;
        // }else{
        //     System.out.println("Declined ... no fund available");
        // }
       
    }
}
