package kr11.co13.bit07;
class Th extends Thread{
    Th(int n){
        setPriority(n);  //Thread 우선 순위 정함
    }
    public void run(){
        System.out.println(getPriority()); //Thread 우선순위 알아냄
    }
}

public class Main1135 {
    public static void main(String[] args){
        //Thred 우선순위 정하기
        Th t1=new Th(Thread.MAX_PRIORITY);
        Th t2=new Th(Thread.MIN_PRIORITY);
        Th t3=new Th(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
