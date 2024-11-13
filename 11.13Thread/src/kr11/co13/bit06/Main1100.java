package kr11.co13.bit06;
class Share{
   synchronized void pr(String str){ //공유 메서드
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
class Th extends Thread{
    Share s;
    String[] str;
    Th(Share s,String[] str){
        this.s=s;
        this.str=str;
    }
    @Override
    public void run(){
        for(int i=0;i<str.length;i++){
            s.pr(str[i]);
        }
    }
}
public class Main1100 {
    public static void main(String[] args){
        Share s= new Share();

        String[] eng={"jave","study","db","spring","cloud"};
        String[] kor={"자바","스터디","디비","스프링","클라우드"};

        Th t1= new Th(s,eng);
        Thread t2=new Th(s,kor); //멀티 스레드

        t1.start();
        t2.start();

    }
}
