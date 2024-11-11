package kr8.co11.bit17;

public class Practi {
    public static void main(String[]args){
        String str=" ";
        StringBuilder sb= new StringBuilder();

        for(int i=1;i<=100;i++){
            sb.append(i);
        }
        str=sb.toString();//객체 sb를 문자열로 변환
        System.out.println(sb);

    }
}
