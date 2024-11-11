package kr11.co11.bit17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main1538 {
    public static void main(String[] args){
        HashMap<String,String> h= new HashMap<>();

        h.put("연식","28");
        h.put("철수","30");
        h.put("영수","20");

        Set<String> s=h.keySet();

        Iterator<String> it=s.iterator();

        while (it.hasNext()){
            String a=it.next();
            String b=h.get(a);
            System.out.println(a+" "+b);
        }

    }
}
