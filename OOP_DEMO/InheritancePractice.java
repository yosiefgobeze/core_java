package OOP_DEMO;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;

public class InheritancePractice {
    public static void main(String[] args) {
        Father father = new Father();
        father.driveCar();
        Father father2 = new Son();
        father2.driveCar();
    }
}

class Father{
    public void driveCar(){
        System.out.println("Father can drive a car");
    }
}


class Son extends Father {
    public void driveBycle(){
        System.out.println("Son can drive a bycle");
    }
}
