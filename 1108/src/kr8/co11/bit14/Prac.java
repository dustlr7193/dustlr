package kr8.co11.bit14;

public class Prac {
    public static void main(String[] args){
// == 이랑 boolean equals랑 같음

        Integer i = Integer.valueOf(10);// 10을 i에 객채로 저장 //
        int i2 = i; // 자동으로 객체 i가 인트 값으로 전환됨

        Character c1=Character.valueOf('a');//a를 객체
        char c2=Character.valueOf('a');//a를 객체 바꾸고 저장할 때 자동으로 기본타입으로 unboxing 반환 받는건 객채

        Integer i3= Integer.valueOf("80");   //80이라는 문자를 인태저 80객체로
        int i4= Integer.valueOf("80");   //문자열을 80객체로 80객채를 int 형으로 자동 unboxing


    }
}
