package kr.co.bitk02;
interface Cal{
    int total(int a,int b);
    int big(int a,int b);
}
class Calcu implements Cal{
    @Override
    public int total(int a, int b) {
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        return sum;
    }
    @Override
    public int big(int a, int b) {

        return (a>b?a:b);
    }
}
public class Main {
    public static void main(String[] args){
        Cal c=new Calcu();

        System.out.println(c.total(12,15));
        System.out.println(c.big(7,24));
    }
}
