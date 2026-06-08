package Logical;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class copy {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<Integer>();
        // CopyOnWriteArrayList<Integer> i= new CopyOnWriteArrayList<>();
        // ConcurrentHashMap<Integer,INte> i= new ConcurrentHashMap<>();
        i.add(1);
        i.add(2);
        i.add(4);
        i.add(2,3);
        for( Integer ent:i){
            i.add(6);
            System.out.println(ent);
        }

    }
}
