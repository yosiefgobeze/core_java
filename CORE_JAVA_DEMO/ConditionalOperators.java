package CORE_JAVA_DEMO;
public class ConditionalOperators {
    public static void main(String[] args) {
        double price = 256.25;
        if (price <= 200.00) {
            System.out.println("It is cheap!");
        }else{
            System.out.println("Expensive!");
        }

        int x = 11, y = 9, z = 15;

        if (x>y) {
            if (x>z) {
                System.out.println("X: " + x);
            }else{
                System.out.println("Z: " + z);
            }
        }else if (y>z) {
            System.out.println("Y: " + y);
        }else{
            System.out.println("Z: " + z);
        }
    }
}
