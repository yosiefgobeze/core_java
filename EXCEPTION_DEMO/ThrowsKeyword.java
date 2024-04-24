package EXCEPTION_DEMO;

/*
 * The use of throws keyword is, when a method is not handling a checked exception but needs to throw the exception to the calling method
 * even main method can make use of the throws keyword, but imagine it will be the jvm who should handle it and it is not good idea
 */
public class ThrowsKeyword {
    public static void main(String[] args) {
        BestBuyStore bbs = new BestBuyStore();
       // bbs.computers(); // here since the computers method is throwing an exception it needs to be handled
       try{
        bbs.computers();
       }catch(ClassNotFoundException e){
        System.out.println("You got an exception: " + e);
       }

       bbs.electronics();
    }
}

class BestBuyStore{
    public void computers() throws ClassNotFoundException{
        // check if the Laptop is available and if load it
        // here a Class.forName is a checked exception and it is asking us to hand it
        Class.forName("Laptop");
    }


    // one way of handling check exception.
    public void electronics(){
        try{
            Class.forName("SamsungTv");
        }catch(ClassNotFoundException e){
            System.out.println("You got an exception: " + e);
        }
        
    }

}


