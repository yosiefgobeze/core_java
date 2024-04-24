package CORE_JAVA_DEMO;
public class ObjectDemo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int num1 = 5;
        int num2 = 25;
        int sum = cal.add(num1, num2);
        System.out.println("Total sum for: " + (num1 + num2) + " = " + sum);
        
    }
}

/**
 * Calculator
 */
class Calculator {
    public int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }
}
