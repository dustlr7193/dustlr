package kr.co.bitk04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        int a[]=new int[5];  //배열에 1차원 5열
        int cnt=0;
        int sum=0;

        while (cnt<5){
            try{
                System.out.println((cnt+1)+"번째 정수");
                a[cnt]=s.nextInt();
                //a[0],a[1],a[2],a[3],a[4]
                sum+=a[cnt];
                cnt++;
            }catch (InputMismatchException e){    //Exception과 상속관계
                System.out.println("다시 정수로 입력");                          //nextline()=문장 입력할때
                s.next();      //앞 토큰 지월때 (토큰 입력값),s.next() 지우는 메소드 //next()=하나의 단어 입력할때
                continue;      //지우고 나서 반복문 다시 실행
            }
        }
        System.out.println("총합 : "+ sum);
    }
}
//next()