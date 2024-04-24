package CORE_JAVA_DEMO;
public class LogicalOperator {
    public static void main(String[] args) {
        // check if age is above 18 and customer has an id
        boolean hasId = true;
        int age = 25;
        if ( hasId == true && age >= 18) {
            System.out.println("Allow user");
        }else{
            System.out.println("Not allowed");
        }
    }
}
