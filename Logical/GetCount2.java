package Logical;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GetCount2 {
    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(1, 2, 3, 4, 5, 2, 2);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (Integer num : i) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 2) {
                System.out.println(entry.getValue());
            }
        }
    }
}