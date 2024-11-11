package kr8.co11.bit04;
class Circle{
    int x;
    Circle(int x){
        this.x=x;
    }
    @Override
    public boolean equals(Object obj){
        Circle c= (Circle) obj;
        if(x==c.x){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString(){
        return x+" "; //Integer.toString(x); // Intger.toString 숫자를 문자로  //Integer.parseInt() 문자멸을 숫자로
    }

}
public class Main {
    public static void main(String[] args) {
        Circle a = new Circle(30);

        Circle b = new Circle(30);

        System.out.println("반지름" + a);

        System.out.println("반지름" + b);

        if (a.equals(b)) {
            System.out.println("같은 원");
        } else {
            System.out.println("다른 원");
        }
    }
}