package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> result = new HashMap<>();

        //map1의 key 값만 가져옴
        for (String key : map1.keySet()) {
            //map2에 동일한 key가 있는지 확인
            if (map2.containsKey(key)) {
                //동일한 key 값이 존재하면 그대로 key를 얻고
                //해당 key에 맞는 value값을 map1, map2,를 더해서 출력
                result.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(result);
    }
}
