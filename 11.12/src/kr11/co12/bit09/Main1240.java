package kr11.co12.bit09;

import java.util.Scanner;

class Calc{
    int calculate(int y){
    int sum=0;
        for(int i=1;i<=y;i++){
        if(i%2!=0){
            sum+=i;
        }
    }return sum;
    }
}
public class Main1240 {
    public static void main(String[] args){
     //1. 5부터 10까지의 정수형 데이터를 입력받아 5~10이외의 정수형이 입력되면 “다시입력”이라고출력한다.
     // 입력받은 정수값을Calc class의calculate()함수를 이용하여 1부터 입력받은숫자까지 홀수만 더하는 프로그램을작성해라.
     // (calculate()함수는 int형정수를 입력받아 1부터 입력받은숫자까지 홀수의합을 구하여 리턴하는 함수
        int x;
        int i=0;
        int sum=0;
        Scanner scanner =new Scanner(System.in);

        while (i<5){
            System.out.println("5~10까지 정수");
            x=scanner.nextInt();
            if(x>=5 && x<= 10){
                sum+=x;
                i++;
            }else {
                System.out.println("다시입력");
                continue;
            }
        }
        System.out.println(sum);


        Calc c= new Calc();
        System.out.println("1부터 더하고 싶은 범위");
        int y=scanner.nextInt();
        System.out.println(c.calculate(y));


    }
}
