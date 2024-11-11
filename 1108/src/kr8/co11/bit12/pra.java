package kr8.co11.bit12;
class Number{
   void show(double y){
       System.out.println(y);
   }
    static void pr(int x){
        System.out.println(x);
    }
}
public class pra {
    public static void main(String[] args){
        Number.pr(100); //클래스로 바로 호출 하려면 정적 맴버여야함

        Number n=new Number();

        n.show(3.14);
    }
}
