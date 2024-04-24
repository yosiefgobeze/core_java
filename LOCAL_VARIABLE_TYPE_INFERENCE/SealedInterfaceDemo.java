package LOCAL_VARIABLE_TYPE_INFERENCE;

/*
 * The extending interfaces can not be final but can be sealed and non-sealed
 * 
 */
public class SealedInterfaceDemo {
    public static void main(String[] args) {
        
    }
}

sealed interface A permits B{

}


non-sealed interface B extends A {

    
}
