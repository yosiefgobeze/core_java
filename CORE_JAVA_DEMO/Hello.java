package CORE_JAVA_DEMO;
public class Hello{
    public static void main(String[] args){
        int num = 6;
        int age = 20;
        int result = num + age;
        System.out.println("coming back to core java!");
        System.out.println("Result is: " + result);
        // casting 
        float a = 50.40f;
        int b = (int)a;
        System.out.println("Float value: " + a);
        System.out.println("Integer value: " + b);
        int c = 1253689;
        System.out.println("Remainder of c%m: " + c%256);
        byte m = (byte) c;
        System.out.println("Byte value m: " + m);
        byte k = 2;
        byte g = 2;
        int j = k * g;
        System.out.println("Product J: " + j);
        int weight = 62;
        if(weight <= 65){
            System.out.println("Weight: " + weight);
        }

    }
}