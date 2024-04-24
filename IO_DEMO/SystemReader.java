package IO_DEMO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemReader {
    public static void main(String[] args) {
        // with in System class -- we have the out object declaration public static final PrintStream out = null;
        // in java System.out -- is accessing the println of the PrintStream class
        System.out.println("Outputing ....");
        // also there is the System.in --- and access the read of the PrintStream but it gives interger ascii value of all the keyboard
        // characters
        try {
            int read =  System.in.read();
            System.out.println(read);
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        // there is a better obtion BufferedReader 
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        try {
            int num = Integer.parseInt(bf.readLine());
            //String hi = bf.readLine();
            System.out.println("The number is: " + num);
        } catch (Exception e) {
            System.out.println("What is the exception: " + e);
        }        
    }
}
