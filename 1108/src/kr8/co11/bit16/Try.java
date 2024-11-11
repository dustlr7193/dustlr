package kr8.co11.bit16;

import java.util.Random;

public class Try {
    public static void main(String[] args){

        System.out.println(Math.round(3.14)); //반올림
        System.out.println(Math.exp(2)); //e의 제곱
        System.out.println(Math.pow(2,10)); //
        System.out.println(Math.sqrt(9.0));

        Random r=new Random(10);
        int r1=r.nextInt(20)+1; //==Math.random
        System.out.println(r1);
    }
}
