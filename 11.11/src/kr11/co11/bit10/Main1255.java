package kr11.co11.bit10;

import java.util.Vector;

public class Main1255 {
    public static void main(String[] args){

        Vector<Integer> v = new Vector<>();
        v.add(4);
        v.add(4);
        v.add(10);
        v.add(0,20); // 인덱스 0에 20을 넣겠다

        System.out.println("벡터의 갯수: "+v.size());

        for(int i=0;i<v.size();i++){
            int j=v.get(i);
            System.out.println(j);
        }

    }
}
