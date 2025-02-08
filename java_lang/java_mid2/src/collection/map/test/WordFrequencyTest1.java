package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();

        String[] text2 = text.split(" ");

        for (String a : text2) {
            Integer count = map.get(a);
            if (count == null) {
                count = 0;
            } else {
                count++;
            }
            map.put(a, count);
        }

        System.out.println(map);
    }
}
