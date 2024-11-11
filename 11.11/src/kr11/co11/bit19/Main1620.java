package kr11.co11.bit19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main1620 {
    public static void main(String[] args){
        HashMap<String,String> h=new HashMap<String,String>();

        h.put("computer","컴퓨터");
        h.put("coffee","커피");
        h.put("cream","크림");
        //키들의 집합
        Set<String> s=h.keySet();
        //Iterator 객체 생성
        Iterator<String> it=s.iterator(); //영어 단어들

        while (it.hasNext()){
            String a= it.next(); //임의의 영단어(키)(순서 유지x)
            String b=h.get(a);   //임의의 영단어(키) 기준으로 한글단어(값)

            System.out.println(a+" "+b);
        }
        Scanner scanner =new Scanner(System.in);

        for (int i=0;i<3;i++){
            System.out.println("찾을 단어");
            String in=scanner.next();        //영단어(키) 입력
            String sol=h.get(in);            //영단어(키)를 기준으로 한글단어(값) 리턴
        if (sol==null){
            System.out.println(in+"는 없는 단어");

        }else {
            System.out.println(sol);
        }
        }
    }
}
