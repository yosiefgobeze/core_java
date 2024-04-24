package OOP_DEMO;
/*
 * Every time a jvm starts it will load the classes and static block first
 */
public class StaticVariableDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        // Mobile.type = "Smartphone";
        m2.brand = "Samsung";
        m2.price = 17000;
        m1.printMobile();
        m2.printMobile();
    }
}

class Mobile{
    String brand;
    int price;
    // static will be shared among all objects and will not be particular to any object
    static String type;

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("Constractor is called... as many number of Objects are created.");
    }

    public void printMobile(){
        System.out.println(brand + " : " + price + " : " + type);
    }

    static{
        type = "Phone";
        System.out.println("Regardless of how many objects you create, static block is called only ones.");
    }
}
