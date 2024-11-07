package kr.co.bit05;
interface Food{
    public String name();
        }
class Pizza implements Food{
    public String name(){
        return "피자";
    }
}
class Steak implements Food{
    public String name(){
        return "스테이크";
    }
}
public class Main {
    static void pr(Food f) {
        System.out.println(f.name());
    }
    public static void main(String[] args){

        pr(new Pizza()); //Food f=new Pizza();
        pr(new Steak());

    }
}
