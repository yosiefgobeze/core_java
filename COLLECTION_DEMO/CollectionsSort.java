package COLLECTION_DEMO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

/*
 * what if i need to display list elements in an order, natural as well as custom
 */
public class CollectionsSort {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(58);
        ages.add(24);
        ages.add(33);
        ages.add(51);
        ages.add(79);
        // use Collections.sort() to sort the elements in a natural order
        // but what if i need to order then in a custom way, like order them according to the last digit
        Collections.sort(ages, new Comparator<Integer>() {
            public int compare(Integer age1, Integer age2) {
                if (age1%10 > age2%10) {
                    return 1;
                }else if (age1%10 == age2%10) {
                    if (age1 > age2) {
                        return 1;
                    }else{
                        return -1;
                    }
                }
                else 
                    return -1;
                
                
            };
        });
        Iterator<Integer> iterator = ages.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
