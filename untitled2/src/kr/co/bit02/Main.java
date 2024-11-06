package kr.co.bit02;
class XY{
    private int x,y;

    public void set(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void show(){
        System.out.println(x+","+y);
    }
}

class XYZ extends XY{ //XY를 상속받은 XYZ클래스

    private String name;

    void setname(String name){
        this.name=name;
    }
    void pr(){
        show();
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {

        XY x=new XY();
        x.set(4,8);
        x.show();  //4,8출력

        XYZ y=new XYZ(); //XY를 상속받은 XYZ클래스
        y.set(6,8);   //부모클래스로 부터 상속받은 메소드
        y.setname("xyz");
        y.pr(); //6,8,xyz

    }
}
