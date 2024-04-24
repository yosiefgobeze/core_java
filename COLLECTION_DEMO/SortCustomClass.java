package COLLECTION_DEMO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCustomClass {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(1250.50, "Mac book pro"));
        laptops.add(new Laptop(1040.74, "Hp Pavillion"));
        laptops.add(new Laptop(1750.10, "Dell XPS 13"));
        laptops.add(new Laptop(958.62, "Lenovo"));
        laptops.add(new Laptop(786.95, "Windows surface"));

        // the Laptop class can not use the Collections.sort() directly because it needs to implement the comparable
        // for instance the Integer class can use the Collections.sort() because it implements the comparable interface
        // that is why for List<Integer> prices = new ArrayList<>() uses Collections.sort() dirctly 
        // so inorder for Laptop class to use the Collections.sort() it needs to implement Comparable and use compareTo

        Collections.sort(laptops);
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

    }
}

class Laptop implements Comparable<Laptop>{
    double price;
    String name;

    public Laptop(double price, String name){
        this.price = price;
        this.name = name;
    }

    public String toString(){
        return "Laptop: [ "+ this.name + " => " + this.price + " ]";
    }

    public double getPrice(){
        return this.price;
    }

    public int compareTo(Laptop that) {
        if (this.getPrice() > that.getPrice()) {
            return 1;
        }else{
            return -1;
        }
    }
}

