package OOP_DEMO;

public class ClassForName {
    // if a class is not loaded, through any means like
    /*
     * 1. object of the class is created
     * 2. static variable or method is referenced
     * 3. static final variable is referenced or any other means , the class will not be loaded
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // if in any way class is not loaded, it can be used and exception will be thrown
        //Laptop laptop = new Laptop(); // static block will print because class is loaded
        //String name = Laptop.name; // satic block will print because class is loaded
        //int price = Laptop.PRICE; // here the static block will not print because class is not loaded
        // to load a class use Class.forName(String class name)
        Class.forName("OOP_DEMO.Laptop");
        System.out.println(Laptop.PRICE);

    }
}

class Laptop{

    static String name = "DELL";

    static final int PRICE = 2500; 

    public static void showDetail(){
        System.out.println(name + " " + PRICE);
    }

    static{
        // whenever a class is loaded a static block will also be loaded once and this is used as a means to verify a class is loaded
        System.out.println("Class is loaded....");
    }

}
