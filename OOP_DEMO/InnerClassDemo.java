package OOP_DEMO;

public class InnerClassDemo {
    public static void main(String[] args) {
        // you can not create object of an inner class directly
        A obj = new A();
        obj.display();
        // obj.showHidden() will not work -- method showHidden() can be seen
        A.B obj1 = obj.new B(); // incase B is static, A.B obj1 = new A.B() 
        obj1.showHidden();
    }
}

// only inner class can be declared as static

class A{
    int age;

    public void display(){
        System.out.println("Inside class A:");
    }

    class B{
        public void showHidden(){
            System.out.println("I am hidden here inside class B:");
        }
    }
}
