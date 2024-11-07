package kr.co.bit08;
interface Animal{
    void  bear();   ////(public) void bear(); 인터페이스에서 ()생략하면 public 자동
}
interface Fish{
    void swim();    //(public) void swim(); 인터페이스에서 ()생략하면 public 자동
}
class A implements Animal,Fish{
    @Override
    public void bear() {   //인터페이스에 public이 생략된거라 class에서 오버라이딩 할 땐 형식을 맞춰서야 해서 public 적어줌
        System.out.println("포식자");   //class에서는 생략하면 디폴트
    }
    @Override
    public void swim() {
        System.out.println("피식자");
    }
}
public class Main {
    public static void main(String[] args){

        A a= new A();  //기본 생성자라 생성자 생성 안해도됨
        a.bear();
        a.swim();
    }
}
