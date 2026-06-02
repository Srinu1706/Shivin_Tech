package Logical;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepated {
    public static void main(String[] args) {
        String s = "programming";

        Set<Character> set = new LinkedHashSet<>();

        for (char character : s.toCharArray()) {
            if (set.contains(character)) {
                System.out.println("First repating character " + character);
                break;
            }
            set.add(character);
        }
    }
}
