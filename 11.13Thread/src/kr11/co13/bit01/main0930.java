package kr11.co13.bit01;
interface Function{
    int cal(int a);
}

public class main0930 {
    public static void main(String[] args){
    //매개변수 있는 람다식
        Function f=a->a*a; //Function cal 함수를 정의
 //인터페이스에 함수가 하나라 f로 들어가서 인식이 가능한데 두개 이상이면 인식이 안됨 특정 짓지 못함
        System.out.println(f.cal(3));
    }
}
