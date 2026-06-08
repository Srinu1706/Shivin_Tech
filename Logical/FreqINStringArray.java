package Logical;
import java.util.LinkedHashMap;
import java.util.Map;

public class FreqINStringArray {
    public static void main(String[] args) {
        String[] arr = { "pushpa", "pushpa", "Bunny", "Rakka", "Julayi" };

        Map<String, Integer> map = new LinkedHashMap<>();

        // for (String name : arr) {
        //     map.put(name, map.getOrDefault(name, 0) + 1);
        // }

        for(String name:arr){
            map.put(name,map.getOrDefault(name, 0)+1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}