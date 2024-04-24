package OOP_DEMO;

public class WhyInterfaceDemo {
    public static void main(String[] args) {
        Computer cmp = new Laptop();
        Computer dsk = new Desktop();

        Developer dev = new Developer();
        dev.code(cmp, "Dell Inspiron 1825", 16, 1000, 3.15f);
        dev.code(dsk, "Hp Desktop", 32, 2000, 3.56f);
        int price = Computer.PRICE;
        String location = Computer.LOCATION;
        System.out.println("All computers are priced at: " + price);
        System.out.println("All the computers are in: " + location);
    }
}

/**
 *  Computer
 */
interface Computer{
    // when implementing an interface only methods will be required to be implemented
    // all methods are public and abstract by default.
    // every variable in an interface is final and static
    // final because since an interface can't be instantiated means no objects will be created directly, so no need to have non final variables
    // static because we can't create objects directly so how to access those variables, only make them static and access through the interface name itself

    int PRICE = 50;
    String LOCATION = "Office";
    public void specification(String model, int ram, int hd, float processingSpeed);
}

class Laptop implements Computer{
    public void specification(String model, int ram, int hd, float processingSpeed){
        System.out.println("Laptop:\n" + "Model: " + 
        model + "\nMemory: " + ram + "GB\nHard Drive: " + hd + "GB\nProcessing Speed: " + processingSpeed + "Hz");
    }
}

class Desktop implements Computer{
    public void specification(String model, int ram, int hd, float processingSpeed){
        System.out.println("Desktop:\n" + "Model: " + 
        model + "\nMemory: " + ram + "GB\nHard Drive: " + hd + "GB\nProcessing Speed: " + processingSpeed + "Hz");
    }
}

class Developer{
    public void code(Computer cmp, String model, int ram, int hd, float processingSpeed){
        cmp.specification(model, ram, hd, processingSpeed);
    }
}
