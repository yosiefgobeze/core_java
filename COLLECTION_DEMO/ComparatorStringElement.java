package COLLECTION_DEMO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * using the compare method of the Comparator class, compare and sort words based on length
 */
public class ComparatorStringElement {
    public static void main(String[] args) {
        Map<String, Integer> studentGrade = new HashMap<>(); // HashTable<>() is synchronized
        studentGrade.put("Yosief", 95);
        studentGrade.put("Temesghen", 92);
        studentGrade.put("Amanuel", 90);
        studentGrade.put("Biniam", 85);
        studentGrade.put("Tekle", 60);
        studentGrade.put("Abraham", 78);
        studentGrade.put("Dawit", 86);

        for(String key: studentGrade.keySet()){
            System.out.println(key + " : " + studentGrade.get(key));
        }

        System.out.println("Above is non sorted ****************** Below is sorted");

        // print the student name and grade data in sorted order using length of the name of the students
        // Iterator<String> iterator = studentGrade.keySet().iterator();
        // while (iterator.hasNext()) {
        //     Comparator<Integer> com = new Comparator<Integer>() {
        //         public int compare(Integer score1, Integer score2){
        //             if (score1 > score2) {
        //                 return 1;
        //             }else
        //             return -1;
        //         }
        //     };
        // }

        List<String> keys = new ArrayList<>();
        for (String key : studentGrade.keySet()) {
            keys.add(key);
        }

        Collections.sort(keys, new Comparator<String>() {
            public int compare(String key1, String key2){
                if (key1.length() > key2.length()) {
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        for(String key: keys){
            System.out.println(key + " : " + studentGrade.get(key));
        }
    }
}
