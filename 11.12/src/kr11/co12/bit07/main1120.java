package kr11.co12.bit07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Num<T>{
    int n;
    Num(int a){
     n=a;
    }
    @Override
    public String toString(){
        return n+"";
    }
    @Override
    public int hashCode(){
        return n;       //기준을 정해서 그룹핑
    }
    @Override
    public boolean equals(Object object){
        Num num=(Num) object;
        if(num.n==n){
            return true;
        }else {
            return false;
        }
    }
}

public class main1120 {
    public static void main(String[] args){

        HashSet<Num> h=new HashSet<Num>();
        h.add(new Num(30));
        h.add(new Num(40));
        h.add(new Num(50));
        h.add(new Num(50));

        Iterator<Num> it=h.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
