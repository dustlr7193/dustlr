package kr.co.bit09;
interface Po{
    void pr(int x, String name);        //함수 호출 부분에 매개변수 있어서 꼴을 맞춰주면 자동 초기화
    void pr(String name);
}
class Point implements Po{
    @Override
    public void pr(int x, String name) {    //오버라이딩
        System.out.println(name+"책은"+" "+x+"원");
    }

    @Override
    public void pr(String name) {           //오버라이딩
        System.out.println(name);
    }
}
public class Main {
    public static void main(String[] args){
        Po p=new Point();
        p.pr(30000,"java");
        p.pr("python");
    }
}
