package kr8.co11.bit10;

public class Main {
    public static void main(String[] args){
        String str1="java";
        String str2="C++";
        int r=str1.compareTo(str2); // 사전순 반환형 int
            //str1<str2

        if(r==0){
            System.out.println("같다");
        } else if (r<0) { //사전에 먼저 나오면 음수 리턴 str1이 str2보다 먼저 나옴//str1<str2
            System.out.println("Java가 c++보다 작다");
        }
        else{  //r>, str1>str2//사전에 나중에 나오면 양수 리턴0
            System.out.println("java가 C++보다 크다");
        }
    }
}
