package LOCAL_VARIABLE_TYPE_INFERENCE;

/*
 * Java is used to be staticaly strongly typed, that means you can't use the variables without declaring type
 * but since java 10, they have introduced the var and it is only applicable to local variables.
 */
public class LocalVariableInferenceTypeDemo {
    // var f = 200; // var can't be used outside a method  it is use as a local variable only
    public static void main(String[] args) {
        int a = 20;
        var b = 25;

        int c;
        String me;
        // var d; // you can't use var without initializing it

        int[] intArray = new int[10];
        var varArray = new int[10];  // making square bracket on left side will generate compile error

        // even for custom class initialization we can use var
        var customDesign = new Design();
    }
    
}
