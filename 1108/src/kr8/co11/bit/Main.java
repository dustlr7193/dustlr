package kr8.co11.bit;
class Point{
    int a,b;
    Point(int a,int b){
        this.a=a;
        this.b=b;
    }
    @Override
 public boolean equals(Object obj){ //obj=b
        Point p= (Point)obj;
        if(a==p.a && b==p.a){
            return true;
        }
        else{
            return false;}
    }

}
public class Main {
    public static void main(String[] args){

        Point a=new Point(1,2);
        Point b=new Point(1,2);
        Point c=new Point(2,3);

        if(a==b){
            System.out.println("a==b");}
        if(a.equals(b)){
            System.out.println("a,b같다");
        }
        if(a.equals(c)){
            System.out.println("a,c같다");
        }

    }
}
