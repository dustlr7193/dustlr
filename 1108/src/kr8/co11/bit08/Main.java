package kr8.co11.bit08;

import java.util.Scanner;

class Profile{
    String name,id;
    Profile(String name, String id){
        this.name=name; this.id=id;
    }
    String getname(){

        return name;}
    String getid(){

        return id;}
}
public class Main {
    public static void main(String[] args){
        String a,b;

        Scanner scanner=new Scanner(System.in);
        System.out.println("정수 입력");
        int x=scanner.nextInt();
        Profile[] ary=new Profile[x]; //객체 배열을 만듦


        for(int i=0;i<x;i++){
            System.out.println("이름");
            a=scanner.next();
            System.out.println("아이디");
            b=scanner.next();

            ary[i]=new Profile(a,b); //배열에 객체를 만듦
        }                           //객채 배열 안에 객체 들어있음
         for (Profile pro:ary){   //객체 배열 안에 있는 객체들을 하나씩 분리해서 출력(하나씩 대입해)
             System.out.println(pro.getname()+" "+pro.getid());
        }

    }
}
