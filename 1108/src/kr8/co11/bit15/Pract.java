package kr8.co11.bit15;

import java.util.Random;

public class Pract {
    public static void main(String[] args){

        Integer i=Integer.valueOf(10);
        int i2=i.intValue(); //Integer 객체를 int 형으로 unboxing

        int i3 = Integer.parseInt("123") ;    //문자열을 기본 데이터 타입으로 unboxing

        //기본 타입을 문자열
        String s1 =Integer.toString(123); //정수형123을 문자열 123으로저장
        String s2=Character.toString('a'); //하나의 문자를 문자열로

        Integer i5=Integer.valueOf(23);
        System.out.println(i5.doubleValue());//정수를 double unboxing

        Double d9=Double.valueOf(3.14);
        System.out.println(d9.toString());

        boolean b54=(5<3);
        System.out.println(Boolean.toString(b54)); //false를 문자열 "flase"로
        System.out.println(Boolean.parseBoolean("false")); //기본형으로

        Integer in=39; //정수형을 자동으로 객체형으로 박싱

        int p=in.intValue(); //기본타입으로 언박싱
        //객체 > 기본 언박싱 / 기본 객채
        String str="adf";   //JVM내부에 저장
        String str1=new String("adf");  //힙 메모리에 생성
        //str,str1은 다름

        String str3=new String("hi"); //변경 불가능
        String str4=str3.concat("hellow");
        System.out.println(str3); //hi만 나옴
        System.out.println(str4);//hihellow나옴

        String a="abr\t";
        String b=a.trim(); //공백 제거 메소드 .trim();

        Random random= new Random();
        int n0= random.nextInt(100); //0~99
        System.out.println(n0);
    }
}
