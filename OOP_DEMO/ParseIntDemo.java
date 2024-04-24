package OOP_DEMO;

import java.util.Scanner;

public class ParseIntDemo {
    public static void main(String[] args) {
        DoAreaCalculation cal = new DoAreaCalculation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the side of the square.");
        String side = sc.nextLine();
        try {
            int intSide = Integer.parseInt(side);
            cal.calculateArea(intSide);
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid side size");
        }
        sc.close();       
    }
}

class DoAreaCalculation{
    public void calculateArea(int side){
        int area = side * side;
        System.out.println("Area: " + area);
    }
}
