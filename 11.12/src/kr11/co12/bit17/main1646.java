package kr11.co12.bit17;

class Th implements Runnable{
    String str;

    Th(String str){
        this.str=str;
    }
    //605p
    @Override
    public void run() {
    for(int i=0;i<10;i++)
        System.out.println(str);
    try {
        Thread.sleep(1000);  //1000=1초
    }catch (Exception e){

    }
    }
}

public class main1646 {
    public static void main(String[] args){

        Th t =new Th("스레드1");  //Runable 구현 객체/ 스레드 객체생성
       Thread thread=new Thread(t);
        // Runnable task=new Th("스레드1");
       // Thread thread =new Thread(task);
        thread.start();

    }
}
