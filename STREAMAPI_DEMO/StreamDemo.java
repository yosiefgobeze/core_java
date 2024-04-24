package STREAMAPI_DEMO;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * how the Stream api simplifies working with data
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(14, 22, 72, 41, 52, 63, 2, 8);
        // Stream is an interface
        Stream<Integer> s1 = ages.stream(); // the stream() method of Collection class returns a Stream<E>
        //s1.forEach(age -> System.out.println(age)); // you can't reuse a stream twice
        // s1.forEach(age -> System.out.println(age)); // this will give runtime exception, because a Stream interface extends BaseStream which inturn extends AutoCloseable
        Stream<Integer> s2 = s1.filter(age -> (age%2 == 0));
        s2.forEach(age -> System.out.println(age));


    }
}
