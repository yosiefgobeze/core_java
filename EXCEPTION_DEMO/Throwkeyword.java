package EXCEPTION_DEMO;

import java.util.Scanner;

/*
 * in a try ... catch block, a catch block will be executed only when an exception happens in the try message
 * but what if you need to do some logic or statement in the catch block even if there is not exception
 * logicaly catch block accepts, an Object of exception, so if there isn't one you should create one
 * Throw -- is used to create an exception and catch will recieve it
 */
public class Throwkeyword {
    // simple work here to add a bonus for those having below $3000 a month
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base salary...");
        int bonus = 1500;
        int promo = 1000;
        int baseSalary = sc.nextInt();

        try{
            System.out.println("Your base salary: " + baseSalary);
            if (baseSalary <= 3000) {
                throw new Exception("Hey, you deserve more....");
            }else if (baseSalary > 3000 && baseSalary <= 5000) {
                throw new YosiefException("You will get promotion...");
            }
        }catch(YosiefException e){
            System.out.println("Your message: " + e);
            System.out.println("Salary after bonus: " + (baseSalary + promo));
        }catch(Exception e){
            System.out.println("Your message: " + e);
            System.out.println("Salary after promotion: " + (baseSalary + bonus));
        }
    }
}

/**
 * you can create a custom exception class and provide the definition there
 */
class YosiefException extends Exception{
    public YosiefException(String msg){
        super(msg);
    }
}
