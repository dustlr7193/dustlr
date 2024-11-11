package kr11.co11.bit01.na01;

class Program<T>{   //모형자<>:제네릭 - 다형성(형 변환(up,down casting)
    public T content;
    T t;   //아직 타입 클래스가 정해지지 않음
    void in(T t){
        this.t=t;
    }
    T get(){
        return t;
    }
}
class Java{
    String a;
    Java(String a){
        this.a=a;
    }
    void show(){
        System.out.println(a);
    }
}
class DB{
    String a;
    DB(String a){
    this.a=a;}
    void show(){
        System.out.println(a);
    }
}
public class Main {
    public static void main(String[] args) {
        //<> 안에 클래스명을 넣어야함;
        Program<Java> p= new Program<>(); //객체 생성코드 T가 Java 클래스됨
        p.in(new Java("Java"));     //p사 제네릭으로 Java로 구체화 했기때문에 Java 객체 생성해서 넣음
        //==Java j=new Java("Java");
        Java j= p.get();
        j.show();

        Program<DB> p1=new Program<>();

        p1.in(new DB("db"));
        DB db=p1.get();
        db.show();


       // DB db=new DB("DB");
    }
}