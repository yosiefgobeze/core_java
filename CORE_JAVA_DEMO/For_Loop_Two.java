package CORE_JAVA_DEMO;
public class For_Loop_Two {
    // you can have a different style of writing a for loop which is similar to a while loop
    public static void main(String[] args) {
        int i = 1; // initialize the variable i
        for(; i <= 5;){ // must do a semicolon before and after the condition check
            System.out.println("Print i: " + i);
            i++; // pre or post increment
        }
    }
}
