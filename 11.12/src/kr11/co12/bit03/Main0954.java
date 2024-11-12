package kr11.co12.bit03;

import java.util.Iterator;
import java.util.Vector;

public class Main0954 {
    public static void main(String[] args){
        Vector<Integer> v=new Vector<>();
        v.add(4);
        v.add(5);
        v.add(2);
        v.add(2,100);
//656p
        Iterator<Integer> it=v.iterator();  //iterator 객체를 얻기(백터에 삽이한 삽을 순타 검색하기 위해)

        while(it.hasNext()){
            int n= it.next();
            System.out.println(n);;
        }
        int sum=0;
        it=v.iterator();
        while (it.hasNext()){
            int n= it.next();
            sum+=n;
        }
        System.out.println();
        System.out.println(sum);
    }
}
