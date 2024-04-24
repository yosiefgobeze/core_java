package OOP_DEMO;

/*
 * In java we have three types of interfaces
 * 1. Normal Interface, an interface with morethan one abstract (declared) only methods
 * 2. Functional Interface or SAM(single abstract method) Interface, an interface with only one abstract method
 * 3. Marker Interface, an interface having an empty body
 */
public class InterfaceTypes {
   public static void main(String[] args) {

    // 1. using a separate class to implement an interface and create object
    A obj1 = new B();
    obj1.show();

    // 2. using an anonymous class to implement and create an object of an interface
    A obj2 = new A() {
        public void show(){
            System.out.println("Anonymous class to implement interface A....");
        }
    };
    obj2.show();

    // 3. using a lambda expression
    A obj3 = () -> System.out.println("Lambda expression to implement interface A...");
    obj3.show();

    MultiplyNumber obj4 = (int a, int b) -> { return (a * b);};
    int product = obj4.multiply(11, 10);
    System.out.println("Product is: " + product);
    
   }
}

// one way to create an object of an interface is by implementing it and implementing the abstract methods too
// But as with abstract classes, we can use an anonymous inner class, instead of implementing it
class B implements A{

    @Override
    public void show() {      
        System.out.println("class B implementes interface A");
    }
    
}

@FunctionalInterface
interface A{
    // if a method is only declared it is public and abstract in an interface
    void show();
}

@FunctionalInterface
interface MultiplyNumber {
    int multiply(int a, int b);    
}