package Logical;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxFreq {
    public static void main(String[] args) {
        String[] arr = { "pushpa", "pushpa", "Bunny", "Rakka", "Julayi" };

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        String mostFrequent = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        if (mostFrequent != null) {
            System.out.println("Most frequent element: " + mostFrequent + " (" + maxCount + ")");
        } else {
            System.out.println("No elements found.");
        }
    }
}
