package kr.co.bitk03;

import java.util.Scanner;

class Num extends Exception{
    Num(){
        super("잘못된 값!!");  //부모 생성자 Exception 호출 Exception은 자바에서 제공
    }

}
public class Main {
    static int in() throws Num {  // throw 값을 throws에서 지정한 클래스에 보내서 거기서 처리
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n<0){
            Num num=new Num();
            throw num;
        }
        return n;
    }
    public static void main(String[] args){

        System.out.println("양수 입력: ");

        try {    //에외발생할 수 있는 코드
            int n=in();
            System.out.println(n);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
                                                    //final 은 생략가능
        }
    }
}
