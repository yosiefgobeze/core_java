package CORE_JAVA_DEMO;
public class LoopInJava {
    // while, do while, for
    public static void main(String[] args) {
        int i = 0;
        boolean isFive = false;
        while(!isFive){
            i++;
            System.out.println("i: " + i);
            int j = 1;
            while (j<=3) {
               System.out.println("Hello there...."); 
               j++;
            }
            isFive = (i==5)?true:false;
            System.out.println("j: " + j);
        }
        System.out.println("i is now: " + i);
    }
 
}
