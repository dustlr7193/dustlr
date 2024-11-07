package kr.co.bitk09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x;
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("정수 입력");
              x=scanner.nextInt();
              if(x%2==0){
                  System.out.println("짝수");
              }
              else{
                  System.out.println("홀수");
              }
            }catch (Exception e){
                System.out.println("종료");
                break;
            }
        }

    }
}
