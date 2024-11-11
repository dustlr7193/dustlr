package kr11.co11.bit14;

import java.util.HashMap;


public class Main1513 {
    public static void main(String[] args){

        HashMap<Integer,String> h=new HashMap<>();
        h.put(1,"보빈");
        h.put(2,"태선"); //삽입

        System.out.println(h.get(1));
        //키 값 기준으로 값 뽑아냄
        System.out.println(h.get(2));

    }
}
