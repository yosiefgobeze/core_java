package COLLECTION_DEMO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    // Collection is an interface
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<>();
        // nums.add(10);
        // nums.add(8);
        // nums.add(6);
        // nums.add(4);
        // nums.add(2);

        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(8);
        prices.add(6);
        prices.add(4);
        prices.add(2);

        Iterator<Integer> iterator = prices.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(10);
        nums.add(8);
        nums.add(6);
        nums.add(4);
        nums.add(2);

        for(int num: nums){
            System.out.println(num);
        }

        Map<String, Integer> studentGrade = new HashMap<>(); // HashTable<>() is synchronized
        studentGrade.put("Yosief", 95);
        studentGrade.put("Temesghen", 92);
        studentGrade.put("Amanuel", 90);
        studentGrade.put("Biniam", 85);
        
        for(String key: studentGrade.keySet()){
            // using the key get all the values
            System.out.println(key + " : " + studentGrade.get(key));
        }

        System.out.println(" ************ Iterator **************");


    }

}
