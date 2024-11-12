package kr11.co12.bit01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //컬렉션: 가변 개수의 객체들의 저장소
        //제네릭기법으로 구현됨(컬랙션 요소는 객체만 가능)
        List<Integer> li=new ArrayList<>(); //정수값만 다루는 제네릭
        li.add(5);      //자동으로  int가 Integer객체로 박싱 되서
        li.add(4);
        li.add(-1);

        li.add(2,100);
        System.out.println("객체수 "+li.size());

        for(int i=0;i<li.size();i++){
            int n=li.get(i);    //자동 언박싱 Integer 객채가 int로
            System.out.println(n);
        }
        int sum=0;
        for(int i=0;i< li.size();i++){
            int n= li.get(i);
            sum+=n;
        }
        System.out.println(sum);
    }
}