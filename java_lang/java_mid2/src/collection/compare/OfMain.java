package collection.compare;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class OfMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
        Set<Integer> set = Set.of(1,2,3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println();
    }
}
