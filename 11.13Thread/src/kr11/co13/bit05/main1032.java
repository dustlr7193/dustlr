package kr11.co13.bit05;
class Music extends Thread{
    String music;
    Music(String m1){
        music=m1;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(music);
            try {
                sleep(1000);
            }catch (Exception e){

            }
        }
    }

}
class Movie implements Runnable{
    String movie;
    Movie(String m2){
        movie=m2;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(movie);
        }
    }
}
public class main1032 {
    public static void main(String[] args){
        Music m=new Music("음악");
        m.start();     //클래스 객체로 start 호출하면 extends

        Movie mo=new Movie("영화 재생");
        Thread t=new Thread(mo);    //Thread 객체에 Movie 객체를 넣어서
                            //실행함 implements;
        t.start();

        try{
            m.join();   //영화재생 끝날때까지 Music이 기다림
            t.join();   //Music이 끝날때까지 영화재생이 기다림
                        //JVM이 관리해서 뭐가 먼저 시작될지 모름
        }catch (Exception e){

        }
    }
}
