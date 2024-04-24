package OOP_DEMO;

public class AbstractAndAnonymous {
    public static void main(String[] args){
        // one way to implement the abstract class
        Food f = new AfricanFood();
        f.calories();
        f.cook();
        f.taste();

        // second way is to just create an anonymous inner class
        // instead of creating a new implementation class for the abstract class, you can use anonymous
        Food fi = new Food() { 
            @Override
            public void cook() {
                System.out.println("Food has to be cooked....");
            }
        
            @Override
            public void taste() {
                System.out.println("Food need to have a taste....");
            }
        };

        fi.calories();
        fi.cook();
        fi.taste();
    }
}

abstract class Food{
    public abstract void cook();
    public abstract void taste();
    public void calories(){
        System.out.println("Food has calories.....");
    }
}

// abstract classes can't have objects of their own, but can be implemented Food f = new AfricanFood();
class AfricanFood extends Food{

    @Override
    public void cook() {
        System.out.println("Food has to be cooked....");
    }

    @Override
    public void taste() {
        System.out.println("Food need to have a taste....");
    }
    
}
