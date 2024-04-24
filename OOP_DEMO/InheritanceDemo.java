package OOP_DEMO;


public class InheritanceDemo {
    public static void main(String[] args) {
        ScientificCalculator cal = new ScientificCalculator();
        int pow = cal.mult(2, 4);
        int div = cal.div(2, 4);
        System.out.println("Powered: " + pow);
        System.out.println("Divided: " + div);
    }
}

class ScientificCalculator extends BusinessCalculator{
    public double power(int a, int b){
        return Math.pow(a, b);
    }
}
class BusinessCalculator extends Calculator{
    public int mult(int a, int b){
        return a * b;
    }

    public int div(int b, int a){
        return b/a;
    }
}
class Calculator{
    public int add(int a, int b){
        return a + b;
    }

    public int sub(int b, int a){
        return b - a;
    }
}
