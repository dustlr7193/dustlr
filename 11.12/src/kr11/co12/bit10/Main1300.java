package kr11.co12.bit10;

import java.util.Scanner;

public class Main1300 {
    static void high(int[][] ary,int x,int y) {
        int max = 0;
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = ary[i][j];
                if (a[i][j] >max) {
                    max = a[i][j];
                }
            }
        }System.out.println(max);

    }
    public static void main(String[] args){
        int[][] ary=new int[3][3];

        Scanner scanner=new Scanner(System.in);
        for(int i=0;i< 3;i++){
            for(int j=0;j<3;j++){
                System.out.println("숫자입력");
                int x=scanner.nextInt();
                ary[i][j]=x;
                }
            }
        high(ary,3,3);
        }
    }
