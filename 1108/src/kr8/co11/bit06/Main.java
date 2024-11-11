package kr8.co11.bit06;

public class Main {
    public static void main(String[] args){

        //문자열을 (반환형)'기본타입'으로 unboxing 1권 66p 참조
        int i=Integer.parseInt("123"); // 문자열 123을 정수 123으로 언박싱

        boolean b2 = Boolean.parseBoolean("true");

        double d=Double.parseDouble("3.14");

        //valueof 는 반환형이 '객체'
        int i2=Integer.valueOf(123);
        int i3=Integer.valueOf("10")+Integer.valueOf("20");
        System.out.println(i2+"/"+i3);

        //정수형 문자열로 반환
        String s=Integer.toString(i);

        System.out.println(s);

       /* 언박싱
        Parse~
         ~~Value
         /박싱
        valueOf */

    }
}
