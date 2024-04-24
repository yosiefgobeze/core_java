package CORE_JAVA_DEMO;
public class StringDemo {
    public static void main(String[] args) {
        // string is immutable means objects can not be appended or concatenated e.g
        String me = "Yosief";
        me = me + " Gobeze";
        // here me was a reference variable to the object Yosief, and we update it but a new object will be created 
        System.out.println(me);

        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity()); // by default the StringBuffer has a buffer capacity of 16

        StringBuffer str1 = new StringBuffer("Wellcome"); // Wellcome is size of 8 but the capacity 16 will still remain 
        System.out.println(str1.capacity());

    }
}
