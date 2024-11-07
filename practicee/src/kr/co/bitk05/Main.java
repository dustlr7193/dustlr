package kr.co.bitk05;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calc{
    public  int calculate(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                continue;
            }
            sum+=i;
        }
        return sum;
    }
}

public class Main {
    public static void main (String[] args){
        Scanner s=new Scanner(System.in);

        Calc c= new Calc();
        int n;
        while (true){
            try {
                System.out.println("5~10 정수");
                n=s.nextInt();
                if(n>=5 && n<=10){
                    break;         //제일 가까이 있는 무한 루프 종료
                }
                System.out.println("다시 입력");   //5~10 숫자가 아닐 경우
            }catch (InputMismatchException e){
                System.out.println("다시입력");
                s.next();
            }
        }
        System.out.println(c.calculate(n));
    }
}
