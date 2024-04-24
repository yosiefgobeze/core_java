package OOP_DEMO;
/*
 * As long as the type of an Object reference variable is the parent of the object, during runtime jvm will display the content of 
 * the object not of the type or the parent class.
 */
public class PolyMorphismDemo {
    public static void main(String[] args) {
        Computer cmp = new Computer();
        cmp.printFunc(); // will print method from computer class, because the object is of type computer
        cmp = new Laptop();
        cmp.printFunc(); // will print method from laptop class, because the object is of type laptop
        cmp = new MainFrame();
        cmp.printFunc(); // will print method from mainframe class, because the object is of type mainframe
    }
}

class Computer{
    public void printFunc(){
        System.out.println("A Computer!");
    }
}

class Laptop extends Computer{
    public void printFunc(){
        System.out.println("A Laptop Computer!");
    }
}

class MainFrame extends Laptop{
    public void printFunc(){
        System.out.println("A MainFrame Computer!");
    }
}
