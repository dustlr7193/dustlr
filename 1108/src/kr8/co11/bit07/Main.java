package kr8.co11.bit07;

public class Main {
    public static void main(String[] args){
    //4.실수 9.5 객체화
      Double d1  =Double.valueOf(9.5);
      //4.1 문자열로
      String str= d1.toString();
      //4.2 문자열을 기본형으로
       double d2=Double.parseDouble(str);

        System.out.println(str+"/"+d1+"/"+d2);
    }
}
