package EXCEPTION_DEMO;

import java.util.Scanner;

/*
 * In java we have three types of Errors
 * 1. Compile time error
 * 2. Runtime error -- also known as Exception
 * 3. Logical Error
 */
public class ErrorTypes {
    public static void main(String[] args) {
        // If an exception occurs then you got to handle it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of team members....");
        int teamNumber = sc.nextInt();
        System.out.println("Enter the number of available shirts...");
        int shirts = sc.nextInt();
        int divided = 0;
        int ages[] = {25, 35, 74, 26, 94};
        
        // divide the number of shirts available equally to the team members
        try{
            divided = shirts/teamNumber;
            System.out.println("Age -01: " + ages[1]);
            System.out.println("Age -05: " + ages[5]); // this is ArrayIndexOutOfBounds

        }catch(ArithmeticException e){
            System.out.println("Down below is the exception....\n" +e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Down below is the exception....\n" +e);
        }catch(Exception e){
            System.out.println("There is Exception ... didn't know what happened");
        }

        System.out.println("Each team member recieved ... " + divided);
        System.out.println("Thank you!!");
        sc.close();


    }
}
