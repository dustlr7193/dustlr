package kr.co.bitk08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x,y;
        while (true){
            try {
                System.out.println("두정수 입력");
                x=scanner.nextInt();
                y=scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("실수하면 안된다");
                scanner.next();
            }
        }
        System.out.println("답: "+(x+y));
    }

}
