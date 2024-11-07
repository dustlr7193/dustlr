package kr.co.bit07;
class Tv{
    public void on(){
        System.out.println("티비 켬");
    }
}
interface Computer{
    public void m();        //class Com의 m()메소드와 무관하다
}
class Com{
    public void m(){
        System.out.println("컴");
    }
}
class Ipad extends Tv implements Computer{
    Com c=new Com();
    @Override
    public void m(){
        c.m(); // Com클래스에 있는 m()이 호출
    }
    public void ip(){
        m();    //
        on(); // Tv 클래스 on() 호출
    }

}
public class Main {
    public static void main(String[] args){
        Ipad i =  new Ipad();
        Tv t=i;         //up
        Computer c=i; //up

        i.ip();

    }
}




/*interface A extends 부모인터페이스1,부모인터페이스2
  class B implements 부모인터페이스1, 부모인터페이스2
  class C extends 부모클레스 implements 부모인터페이스
  앞에 인터페이스냐 클래스냐에 따라 extends, implements 가 달라짐,
  인터페이스는 다중상속이 가능 해 implements 뒤에는 여러 부모가 올수있지만
  클래스는 다중 상속이 불가능 해 extends 뒤에는 부모가 한개 와야함
 */
