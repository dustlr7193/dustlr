package kr8.co11.bit03;

public class Main {
    public static void main(String[] args){

       //기본 타입 객체화
        Integer i=10;  //boxing
        int i1=i.intValue(); //un boxing

        Character c='a';  //boxing
        char c1=c.charValue();  //un boxing

        Boolean b=true;       //boxing
        boolean b1=b.booleanValue();   //unboxing

        Integer ii1=100;  //boxing
        int n1=ii1+200;   //unboxing 연산과정에서 자동으로 unboxing
        System.out.println(n1);



    }
}
