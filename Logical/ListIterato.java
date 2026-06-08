package Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterato {
    public static void main(String[] args) {
        // List<Integer> l= new ArrayList<>();
        // l.add(1);
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 10, 8));
        ListIterator<Integer> l1 = l.listIterator();
        System.out.println("Forward");
        while (l1.hasNext()) {
            Integer num = l1.next();
            if (num == 10) {
                l1.set(7);
                num=7;
            }
            System.out.println(num);

        }
        System.out.println("Backward");
        while (l1.hasPrevious()) {
            System.out.println(l1.previous());
        }
    }
}
