package kr11.co11.bit13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1447 {
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
       int n=0;
        for(int i=0;i<=10;i++){
            n=(int)(Math.random()*101);
            a.add(n);
        }

        Iterator<Integer> it= a.iterator();
        while (it.hasNext()){
            int s = it.next();
            System.out.println(s);
        }


    }
}
