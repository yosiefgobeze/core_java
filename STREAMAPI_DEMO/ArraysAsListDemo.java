package STREAMAPI_DEMO;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

/*
 * Arrays is a class which have a method called asList() and it returns a List 
 */
public class ArraysAsListDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(22, 45, 8, 15, 44, 95, 28, 35);
        // printing the values
        System.out.println("*************** using simple sout *******************");
        System.out.println(nums);
        System.out.println("*************** using Iterator **********************");
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("**************** using enhanced for loop ************");
        for (Integer num : nums) {
            System.out.println(num);
        }
        System.out.println("***************** using forEach *********************");
        nums.forEach(n -> System.out.println(n));

    }
}
