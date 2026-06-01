package Logical;

import java.util.*;

public class SortByMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 50);
        map.put("B", 10);
        map.put("C", 30);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
