package OOP_DEMO;

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Object creation for an abstract class is not allowed in java
        Computer cmp = new MiniLaptop();
        cmp.funOn();
        cmp.plugableBattery();
        //cmp.extendDisplay();
    }
}

abstract class Computer{
    public abstract void plugableBattery();

    public void funOn(){
        System.out.println("Fun on when heated....");
    }
}

abstract class DellLaptop extends Computer{
    @Override
    public void plugableBattery(){
        System.out.println("For additional battery, there is a plugable feature....");
    }
    public void editingFeature(){
        System.out.println("Dell laptop has an editing feature...");
    }
}

class MiniLaptop extends DellLaptop{   
    public void extendDisplay(){
        System.out.println("Display can be extended for better view...");
    }
}
