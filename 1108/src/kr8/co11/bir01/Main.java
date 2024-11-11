package kr8.co11.bir01;
class Po{
    int x,y;
    Po(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override       //Object class 자동으로 상속 받아서
    public String toString(){
        return  x+" "+y;
    }
}
public class Main {
    public static void main(String[] args) {

        Po p=new Po(3,4);
        System.out.println(p.hashCode());
        System.out.println(p.getClass().getName());
        System.out.println(p);//toString이 문자열을 출력해주는 기능을하는 것이라서 객체로만 호출이 가능
    }
}