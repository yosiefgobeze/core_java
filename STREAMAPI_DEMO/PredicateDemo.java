package STREAMAPI_DEMO;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo {
    public static <T> void main(String[] args) {
        List<Integer> prices = Arrays.asList(55, 88, 44, 22, 178, 19, 33, 71);
        // filter the even prices only
        Stream<Integer> stream = prices.stream();

        Stream<Integer> s1 = stream.filter(null); // filter needs a Predicate
        s1.forEach(price -> System.out.println(price));

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer price) {
                if (price%2 == 0) {
                    return true;
                }else{
                    return false;
                }
            }           
        };

        stream.filter(null); // filter needs a Predicate
    }
}
