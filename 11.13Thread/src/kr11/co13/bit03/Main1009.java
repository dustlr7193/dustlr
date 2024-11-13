package kr11.co13.bit03;
class Th extends Thread{ //상속 책2번 방법
    String name;
    Th(String n){
        name=n;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name);
            try {     //일시정지 상태에서 예외 나올수 있어서 try
                sleep(1000); //일시정지 1초 정지
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main1009 {
    public static void main(String[] args){
        Th th=new Th("스래드1");
        Th th2=new Th("스래드2");    //상속 받아서 하는거라 Th객채 생성으로
                                      //Th 객체로 스레드 실행 가능

        th.start();
        th2.start();


    }
}
