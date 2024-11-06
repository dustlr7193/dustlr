package kr.co.bit01;
interface Addin{
    public int add(int a, int b);
    public abstract int add(int a);

    default void pr(){
        System.out.println("히히");
    }
    //default라는 예약어를 적지 않으면 다 추상메소드로 인식한다!!!!
}
class Add implements Addin{

    @Override
    public int add(int a, int b){
        return a+b;
    }
    @Override
    public int add(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {

        Add a=new Add();
        System.out.println(a.add(1,4));
        System.out.println(a.add(10)); //1~10까지합
    }
}