import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNon_Repated {
    public static void main(String[] args) {
         
        String str="Shivintech";

        Map<Character,Integer> map= new LinkedHashMap<>();

        for(Character ch:str.toCharArray()){
        map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()==1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
