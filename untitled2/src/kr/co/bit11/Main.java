package kr.co.bit11;
interface A{
    public void funcA();
}
interface B{
    public void funcB();
}
interface C extends A,B{
    public void funcC();
}
class D implements C{
    public void funcA(){
        System.out.println("A");
    }
    public void funcB(){
        System.out.println("A");
    }
    public void funcC(){
        System.out.println("A");
    }
}
public class Main {
    public static void main(String[] args){
        D d1= new D(); //up
        A a1=d1;
        a1.funcA();

        B b1=d1;        //up
        b1.funcB();

        C c1=d1;        //up
        c1.funcA();
        c1.funcB();
        c1.funcC();
        //인터페이스에서 객채 생성불가하기 때문에
        //상속받은 클래스D에서 객체생성

    }
}
