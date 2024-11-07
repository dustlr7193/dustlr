package kr.co.bitk06;
interface Figure{
    void circle_area();
   void rec_area();
}
class Circle implements Figure{
    int x;
    Circle(int x){
        this.x=x;
    }
    @Override
    public void circle_area() {
        System.out.println(x*x*3.14);
    }

    @Override
    public void rec_area() {
        System.out.println();
    }
}
class Rec implements Figure{
   int x;
   int y;
    Rec(int x,int y){
       this.x=x;
       this.y=y;
    }

    @Override
    public void circle_area() {
        System.out.println();
    }

    @Override
    public void rec_area() {
        System.out.println(x*y);
    }
}
public class Main {
    public static void main(String[] args){

        Figure f1=new Circle(5);
        Figure f2=new Rec(2,5);
        f1.circle_area();
        f2.rec_area();
    }
}
