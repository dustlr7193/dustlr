package kr11.co12.bit06;

import java.util.*;

public class Main1100 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int in;

        Map<Integer,String> h=new HashMap<>();
        h.put(1,"one");
        h.put(2,"two");
        h.put(3,"three");

        Set<Integer> s=h.keySet();
        Iterator<Integer> it= s.iterator();

        while(it.hasNext()){
            int ki= it.next();
            String val=h.get(ki);
            System.out.println(ki+" "+val);
        }
        for(int i=0;i< h.size();i++){
            System.out.println("숫자");
            in=scanner.nextInt();
            System.out.println(h.get(in));
        }

    }
}
