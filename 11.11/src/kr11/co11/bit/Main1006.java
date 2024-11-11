package kr11.co11.bit;
class St<T>{
    int n;
    Object[] st;    //객체 배열 선언
    //==Object st= new Object[3];
    St(){
        st=new Object[3]; //객체배열 생성
        n=0;
    }
      public void push(T t){  //제네릭은 아니지만 타입이 정해지지 않다는 것을 표현
        if(n==3){
            return; //n==3 이면 push 함수 종료
        }
        st[n]=t;
        n++;//인덱스 증가
    }
    public T pop(){
        if(n==0){
            return null; //스택이 0이라 꺼낼수 없음
        }
        n--;
        return (T) st[n];
    }
}
public class Main1006 {
    public static void main(String[] args) {


        St<String> s1 = new St<String>();
        s1.push("java"); //n==0 ,st[0]
        s1.push("db");   //n==1 ,st[1]
        s1.push("react"); //n==2, st[2]

        St<Integer> s2 = new St<>();
        s2.push(1);
        s2.push(2);
        s2.push(3);

        for (
                int i = 0;
                i < 3; i++) {
            System.out.println(s1.pop());
        }
    }
}