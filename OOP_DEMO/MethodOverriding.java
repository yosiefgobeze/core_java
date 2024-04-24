package OOP_DEMO;

public class MethodOverriding {
    public static void main(String[] args) {
        PromoMultiplier pm = new PromoMultiplier();
        int mult = pm.add(5, 8);
        System.out.println("Multiplied: " + mult);
    }
}

class Multiplier{
    public int add(int a, int b){
        return a + b;
    }
}

class PromoMultiplier extends Multiplier{
    public int add(int a, int b){
        return a + b;
    }
}
