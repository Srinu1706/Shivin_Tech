package Logical;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class list {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(12,1,2,3,4,5);
        IntSummaryStatistics stats=l.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
    }
}
