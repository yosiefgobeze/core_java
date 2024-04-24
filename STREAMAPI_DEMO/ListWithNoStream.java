package STREAMAPI_DEMO;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * working without the stream api might not be easy
 */
public class ListWithNoStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Emannuel", "Bereket", "Yonas", "Habtom", "Dawit");
        // check each name to find out if a name has an alphabet 'a'
        // this process can be done in a more easy way using stream api
        char find = 'a';
        for(int i = 0; i < names.size(); i++){
            String tempName = names.get(i);
            for(int j = 0; j < tempName.length(); j++){
                if (tempName.charAt(j) == find) {
                    System.out.println("Your name is selected: " + names.get(i));
                }
            }
        }

        // here find the even numbers and their sum
        // below operation can be minimized using the stream api
        List<Integer> nums = Arrays.asList(4, 8, 5, 7, 16, 2);
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i)%2 == 0){
                System.out.println(nums.get(i));
                sum += nums.get(i);
            }
        }
        System.out.println("Sum: " + sum);

        // printing a List of integers like the above one can be done in various ways
        System.out.println("Printing a List of integers................");
        System.out.println("************* using simple sout ***************");
        System.out.println(nums);
        System.out.println("************* using a for loop ************");
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }
        System.out.println("********** using enhance for loop **************");
        for (Integer num : nums) {
            System.out.println(num);
        }

        // last but not least is the forEach but we will dive deep on how it works later
        System.out.println("************ using a forEach *****************");
        nums.forEach(num -> System.out.println(num));

        // so how do the forEach work
        // there is a Consumer interface which helps the forEach to work
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer num){
                // what do you want to do with the block
                System.out.println(num);
            }
        };
        // nums.forEach(Consumer<? super T> action) so, let's replace the curl bracket
        // nums.forEach(Consumer<Integer> con) even nums.forEach(new Consumer<Integer>() {
        //     public void accept(Integer num){
        //         // what do you want to do with the block
        //         System.out.println(num);
        //     }
        // };)
        nums.forEach(new Consumer<Integer>() {
            public void accept(Integer num){
                // what do you want to do with the block
                System.out.println(num);
            }
        });

        // further minimize, since Consumer is a functional interface
        nums.forEach(num ->
                // what do you want to do with the block
                System.out.println(num));
    }
}
