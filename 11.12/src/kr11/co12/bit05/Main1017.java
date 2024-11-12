package kr11.co12.bit05;

import java.util.*;



public class Main1017 {
    public static void main(String[] args){

        List<String> a=new ArrayList<>();
        a.add("one");
        a.add("two");
        a.add("three");


        Iterator<String> it=a.iterator();

        while (it.hasNext()){
            if(it.next().compareTo( "three")==0)
            {
                it.remove();
            }
        }
        System.out.println(a);
    }
}
