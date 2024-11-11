package kr11.co11.bit03;
class Food{
    void show(){
        System.out.println("음식");
    }
}

class Pizza extends Food{
    void show(){
        super.show();       //음식
        System.out.println("피자");
    }
}

class Fo<T>{
    T t;
    void in(T t){
        this.t=t;
    }
    T out(){
        return t;
    }
}

public class Main1052 {
    static void pr(Fo<?extends Food> f){
        Food fo=f.out();
        fo.show();
    }
    public static void main(String[] args){
        Fo<Food> f=new Fo<Food>();
        //Food f1=new Food();
        //f.in(f2)
        f.in(new Food());
        pr(f);  //static 메소드라 함수명만 가능 클래스 안에 있는게 아님
                //Fo<? extends Food> f=f ?에 f가 들어감
                //Food class에 show가 호출 = 출력
        Fo<Pizza> f2= new Fo<Pizza>();
        f2.in(new Pizza());
        pr(f2);
    }
}
