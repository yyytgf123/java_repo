package collection.map;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.HashMap;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100);
        System.out.println(studentMap);

        boolean containKey = studentMap.containsKey("studentA");
        System.out.println("containKey = " + containKey);

        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
