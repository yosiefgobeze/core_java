package CORE_JAVA_DEMO;
public class TernaryOperator {
    public static void main(String[] args) {
        // how to shorten the if els if statement
        int age = 20;
        boolean isEligible;
        if (age >= 18) {
            isEligible = true;
            System.out.println("Is customer eligible: " + isEligible);
        }else{
            isEligible = false;
            System.out.println("Is customer eligible: " + isEligible);
        }

        int price = 40;
        boolean isCheap;
        isCheap = price < 50 ? true : false;
        System.out.println("Is the price cheap: " + isCheap);

        int a = 35, b = 18, c = 22;
        int lar;
        //int lar = (a > b) ? ((a > c)?a:c): ((b > c)?b:c);
        // if (a > b) {
        //     if (a > c) {
        //         lar = a;
        //     }else{
        //         lar = c;
        //     }
        // }else if (b>c) {
        //     lar = b;
        // }else{
        //     lar = c;
        // }
        // System.out.println("lar: " + lar);

        lar =(a > b) ? ((a>c)?a:c):(b>c)?b:c;
        System.out.println("lar: " + lar);
       
    }
}
