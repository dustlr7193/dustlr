package kr11.co12.bit08;
import java.util.Iterator;
import java.util.TreeSet;
class Pro implements Comparable<Pro>{
    String str;
    int n;
    Pro(String str,int n){
        this.str=str;
        this.n=n;
    }
    void show(){
        System.out.println(str+" "+n);
    }


    @Override
    public int compareTo(Pro o) { //객체 특정 필드 비교하는 메소드
        if(n>o.n){       //오름 차순, 현재 객체n 이랑 매개변수로 받은 객채 o.n 값을 비교
            return 1;    //내림 차순은 부호 반대로
        }else if(n<o.n){
            return -1;
        }else {
            return 0;
        }
    }
}


public class Main1200 {
    public static void  main(String[] args){

        TreeSet<Pro> t=new TreeSet<Pro>();
        t.add(new Pro("aa",128));
        t.add(new Pro("bb",333));
        t.add(new Pro("cc",385));

        Iterator<Pro> it = t.iterator();
        while(it.hasNext()){
            it.next().show();
        }

    }
}