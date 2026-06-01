package Logical;
import java.util.LinkedHashMap;
import java.util.Map;

public class Anagaram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        if (s1.length() != s2.length()) {
            System.out.println("Not an anagram");
            return;
        }

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : s2.toCharArray()) {
            if (!map.containsKey(ch)) {
                System.out.println("Not an anagram");
                return;
            } else {
                map.put(ch, map.get(ch) - 1);
                map.remove(ch);
            }
        }
        if (map.isEmpty()) {
            System.out.println("anagram");
        } else {
            System.out.println("not a anagram");
        }
    }
}
