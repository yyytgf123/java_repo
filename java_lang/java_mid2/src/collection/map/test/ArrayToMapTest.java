package collection.map.test;

import collection.map.MapMain2;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> productArrMap = new HashMap<>();
        for (String[] str : productArr) {
            productArrMap.put(str[0], Integer.valueOf(str[1]));
        }

        for (String key : productArrMap.keySet()) {
            System.out.println("제품 : " + key + ", 가격 : " + productArrMap.get(key));
        }
    }
}
