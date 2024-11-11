package kr.co.bitk10;

public class Main {
    public static void main(String[] args){

        for (int i=0; i<5; i++) {   //행을 기준으로
            for(int j=0; j<4-i; j++){ //공백 출력
                System.out.print(" ");
            }
            int n=1;
            for(int j=0;j<(i*2)+1;j++){  //개수만큼
                System.out.print(n);
                n++;  //정수를 1부터 하나씩 증가
            }
            System.out.println();  //열까지 공백, 정수출력한 후 줄바꿈
        }
    }
}