package Logical;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "madam";
       Set<Character> set= new LinkedHashSet<>();

       for (Character ch : str.toCharArray()) {
        set.add(ch);
       }

       System.out.println(set);
    }
}
