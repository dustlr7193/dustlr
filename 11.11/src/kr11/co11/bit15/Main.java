package kr11.co11.bit15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> h = new HashMap<>();

        h.put("물", "water");
        h.put("커피", "coffee");
        h.put("차", "tea");

        Set<String> keys = h.keySet();//물,커피,차

        Iterator<String> it = keys.iterator();

        while (it.hasNext()){
            String a=it.next(); //keys 값 넣기
            String b=h.get(a);  //key에 맞는 값
            System.out.println(a+" "+b);
        }

    }
}
