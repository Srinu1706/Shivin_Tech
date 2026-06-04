import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Optional;

public class Emplyoee_Driver {
    public static void main(String[] args) {
        List<Emplyoee> list = Arrays.asList(
                new Emplyoee(1, "Ravi", "IT", 60000),
                new Emplyoee(2, "Sita", "HR", 45000),
                new Emplyoee(3, "Arjun", "IT", 75000),
                new Emplyoee(4, "Meena", "Finance", 50000),

                new Emplyoee(5, "Kiran", "IT", 85000),
                new Emplyoee(6, "John", "HR", 55000),
                new Emplyoee(7, "David", "Finance", 65000),

                new Emplyoee(8, "Priya", "IT", 72000),
                new Emplyoee(9, "Rahul", "Finance", 90000),
                new Emplyoee(10, "Anjali", "HR", 48000),

                new Emplyoee(11, "Sai", "CA", 900000));

        list.stream()
                .map(Emplyoee::getName)
                .forEach(System.out::println);

        list.stream().filter(sal -> sal.getSalary() > 65000)
                .forEach(System.out::println);

        Long count = list.stream().map(Emplyoee::getName).count();
        System.out.println(count);

        list.stream().filter(dept -> dept.getDepartment() == "IT").forEach(System.out::print);
        System.out.println();

        List<String> names = list.stream().map(Emplyoee::getName).toList();
        System.out.println(names);

        Map<String, Long> data = list.stream()
                .collect(Collectors.groupingBy(Emplyoee::getDepartment, Collectors.counting()));

        data.forEach((dname, dcount) -> {
            System.out.println(dname + " -> " + dcount);
        });

        Emplyoee e1 = list.stream()
                .sorted((a, b) -> Double.compare(a.getSalary(), b.getSalary())).findFirst()
                .get();
        System.out.println(e1); // min sal

        Emplyoee e2 = list.stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).findFirst().get();
        System.out.println(e2);

        // calculate sal of total emp

        Double totalSal = list.stream().mapToDouble(Emplyoee::getSalary).sum();
        System.out.println(totalSal);

        //////////////////////////////////////////////////////////////////////////////////////////////////

        Emplyoee e3 = list.stream().sorted((c, d) -> Double.compare(c.getSalary(), d.getSalary())).findFirst().get();
        System.out.println(e3.getName()); // min sal emp name

        Emplyoee e4 = list.stream().sorted((c, d) -> Double.compare(d.getSalary(), c.getSalary())).findFirst().get();
        System.out.println(e4.getName()); // max sal emp name
        System.out.println();

        // Max sal
        List<Emplyoee> d = list.stream().sorted((a, b) -> Double.compare(a.getSalary(), b.getSalary())).toList();

        d.forEach((dsal) -> {
            System.out.println(dsal.getSalary());
        });
        System.out.println();

        // Min sal
        List<Emplyoee> d1 = list.stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).toList();

        d1.forEach((dsal) -> {
            System.out.println(dsal.getSalary());
        });
        System.out.println();

        // sort emp by names()
        List<Emplyoee> name = list.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).toList();

        name.forEach((n) -> {
            System.out.println(n.getName());
        });

        List<Emplyoee> ln = list.stream()
                .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
                .limit(3)
                .collect(Collectors.toList());

        ln.forEach((Name3) -> {
            System.out.println(Name3.getName());
        });

        Map<String, List<String>> e = list.stream().collect(Collectors.groupingBy(Emplyoee::getDepartment,
                Collectors.mapping(Emplyoee::getName, Collectors.toList())));
        System.out.println(e);

        /////////////////////////////////////////////////////////////////////////////////////////////
        // find Avg sal Dept Wise

        Map<String,Double> avg=list.stream().collect(Collectors.groupingBy(Emplyoee::getDepartment,Collectors.averagingDouble(Emplyoee::getSalary)));
        System.out.println(avg);

        //find the MaxSal DeptWise

        Map<String ,Optional<Emplyoee>> minDeptsal=list.stream().collect(Collectors.groupingBy(Emplyoee::getDepartment,Collectors.minBy((a,b)->Double.compare(a.getSalary(), b.getSalary()))));
        // System.out.println(maxDeptsal);

        minDeptsal.forEach((dept,Maxsal)->{
                Maxsal.ifPresent(emp->{
                        System.out.println(emp.getSalary() +" "+emp.getName()+" "+emp.getDepartment());
                });
        });
        System.out.println();
             Map<String ,Optional<Emplyoee>> maxDeptsal=list.stream().collect(Collectors.groupingBy(Emplyoee::getDepartment,Collectors.maxBy((a,b)->Double.compare(a.getSalary(), b.getSalary()))));
        // System.out.println(maxDeptsal);

        maxDeptsal.forEach((dept,Maxsal)->{
                Maxsal.ifPresent(emp->{
                        System.out.println(emp.getSalary() +" "+emp.getName()+" "+emp.getDepartment());
                });
        });

        List<Emplyoee> namess=list.stream().filter(n->n.getName().toLowerCase().startsWith("s")).collect(Collectors.toList());
        System.out.println(namess);

        
        }
    }