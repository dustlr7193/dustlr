package kr11.co11.bit20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main1640 {
    public static void main(String[] args){
        Map<Integer,Double> m = new HashMap<>();

        m.put(2,3.5);
        m.put(3,5.5);
        m.put(4,6.5);

        Set<Map.Entry<Integer,Double>> s=m.entrySet();

        for(Map.Entry<Integer,Double> s1:s){
            System.out.println(s1.getKey()+" "+ s1.getKey());
        }
    }
}
