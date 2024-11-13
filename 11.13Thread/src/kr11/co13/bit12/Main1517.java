package kr11.co13.bit12;
interface A{
    int cal(int x, int y);
}
public class Main1517 {
    static void pr(int x, int y,A a){
        System.out.println(a.cal(x,y));
    }
    public static void main(String[] args){
        pr(3,4,(x,y)->x+y);
    }
}
