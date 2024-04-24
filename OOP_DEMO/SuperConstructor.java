package OOP_DEMO;

public class SuperConstructor {
    public static void main(String[] args) {
        B b = new B(28);
    }
}

class A{
    public A(){
        System.out.println("A: Constructor!");
    }

    public A(int price){
        System.out.println("Discount for the price: " + (price - (price/2)));
    }
}

class B extends A{
    public B(){
        // every constructor has the super() in the first line by default and will call the parent class. 
        System.out.println("B: Default Constructor!");
    }

    public B(int price){
        super(price);
        // the this() can be used to call a constructor from the same class
       System.out.println("B: Parameterized constructor!" + price);
    }
}
