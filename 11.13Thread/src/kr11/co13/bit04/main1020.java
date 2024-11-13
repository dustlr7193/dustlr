package kr11.co13.bit04;

import static java.lang.Thread.sleep;

class Th implements Runnable {
    String name;

    Th(String n) {
        name = n;
    }


    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(name);
            try {
                sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
public class main1020 {
        public static void main(String[] args){
         Th th=new Th("스래드1");
         Thread t=new Thread(th);

         Th th1=new Th("스레드2");
         Thread t1=new Thread(th1);

         t1.start();
         t.start();

        }
}

