
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Print_Duplicates {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Peddi","RRR","RRR","RRR","Rakka","Rakka");

        Set<String> s= new LinkedHashSet<>();

        for(String name:list){
            if(!s.add(name)){
                System.out.println(name);
            }
        }
    }
}
