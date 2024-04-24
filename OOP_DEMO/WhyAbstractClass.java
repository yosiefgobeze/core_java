package OOP_DEMO;
/*
 * Now let's assume we have a developer class, some developer may work from home and need a laptop, other may work from office 
 * and needs a desktop. so how to make a more flexible program
 */
public class WhyAbstractClass {
    public static void main(String[] args) {
        // if we create a Laptop object with the reference type as Laptop it will not be generic
        Computer lp = new DellInspironLaptop(); // what if developer needs a desktop...
        Computer ds = new HpDesktop();
        // let's create a developer
        Developer dev = new Developer(); // you have hired a developer, and he needs to start coding but needs a laptop
        dev.code(lp); // so how to make the machine as generic not a laptop or desktop
        dev.code(ds);

    }
}

/*
 * to solve all the complications we can make the class Computer as abstract and create implementations
 */
abstract class Computer{
    public abstract void specification(String model, int ram, int hd, float processingSpeed);
        // in reality a computer is a generic name and it is not convenient to implement the method specification() here
}

/**
 *  
 */
class DellInspironLaptop extends Computer{
    @Override
    public void specification(String model, int ram, int hd, float processingSpeed){
        System.out.println("Dell Inspiron: " + model + " \nRam: " + ram + "gb \nHd: " + hd + "gb \nProcessing Speed: " + processingSpeed);
    }
}

class HpDesktop extends Computer{
    @Override
    public void specification(String model, int ram, int hd, float processingSpeed){
        System.out.println("Hp Desktop: " + model + " \nRam: " + ram + "gb \nHd: " + hd + "gb \nProcessing Speed: " + processingSpeed);
    }   
}

/*
 * Developer has to code, but for codding he/she needs a laptop or desktop
 */
class Developer{
    public void code(Computer cmp){
        System.out.println("Developer need a computer....");
        cmp.specification("Inspiron 1825", 4, 1000, 2.58f);  
    }
}

/*
 *
 class Developer{
    public void code(HpDesktop hpDesktop){
        System.out.println("Developer need a laptop....");
        Computer cmp = (Computer)hpDesktop; // we either have to converte the type to the generic Computer or it will be error.
        cmp.specification("Inspiron 1825", 4, 1000, 2.58f);   // if developer needs a desktop we
    }
} 
 */

