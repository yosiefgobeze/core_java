package LOCAL_VARIABLE_TYPE_INFERENCE;

/*
 * In java an abstract class is a class in which an object can not be directly created from it but can be inherited
 * A final class is a class where other sub classes can not inherit. but object of it can be created
 * In between there is a sealed class type, where a sub class can be created but for specific class which are permited
 * The permitted classes should either be final, sealed or non sealed
 */
public class SealedClassDemo {
    public static void main(String[] args) {
        A a = new B();
        A aa = new C();
        C c = new D();
    }
    
}

sealed class A permits B, C{

}

final class B extends A{

}

sealed class C extends A permits D{

}

non-sealed class D extends C{

}

