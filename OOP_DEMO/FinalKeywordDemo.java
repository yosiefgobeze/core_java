package OOP_DEMO;

public class FinalKeywordDemo {
    public static void main(String[] args) {
        double bookPrice = 75; // later the bookPrice can be altered, but what if you need to make price fixed, then use final
        Book book = new TigrinyaBook();
        book.interpretorName();

    }
}

class Book{ // if by any means you need to prevent your class from being inherited use final ( final class Book)
    public void firstAuthor(){ // if you need the method not to be inherited use final (public final void firstAuthor)
        System.out.println("Yosief ... first author!");
    }

    public void interpretorName(){
        System.out.println("Please provide your name ...");
    }
}

class TigrinyaBook extends Book{
    public void interpretorName(){
        System.out.println("Amanuel ... tigrnya book interpretor!");
    }
}
