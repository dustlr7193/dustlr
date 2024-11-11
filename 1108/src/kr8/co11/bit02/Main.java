package kr8.co11.bit02;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        String str = "id=123#name=gildong#addr=seoul";
        StringTokenizer s= new StringTokenizer(str,"#");
        int n=s.countTokens();
        System.out.println(n);

        while(s.hasMoreTokens()){   //hasMoerTokesns() 남은 문자열 있으면 true
            String a=s.nextToken(); //a에 다음 토큰 저장
            System.out.println(a);  //a 출력 ,다음 토큰이 있을 때 까지 다음 토큰 저장해서 출력
        }

    }
}
