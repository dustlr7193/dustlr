package kr8.co11.bit09;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        String a="1+2+3+4+5";
        StringTokenizer n= new StringTokenizer(a,"+");
        int sum=0;
        while (n.hasMoreTokens()){
            sum+=Integer.parseInt(n.nextToken());

        }
        System.out.println(sum);
    }
}
