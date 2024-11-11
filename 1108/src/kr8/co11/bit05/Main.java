package kr8.co11.bit05;
class Point {
    int x, y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return x+" "+y;
    }

}
public class Main {
    public static void main(String[] args){
        Point p = new Point(3,4);


        System.out.println(p);
    }
}
