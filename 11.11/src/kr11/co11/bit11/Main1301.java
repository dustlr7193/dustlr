package kr11.co11.bit11;

import java.util.LinkedList;

class Box<T>{
    Box<T> next;
    T t;

    void in(T t){
        this.t=t;
    }
    T out(){
        return t;
    }
}
public class Main1301 {
    public static void main(String[] args){
        Box<Integer> b=new Box<>();
        b.in(30); //Integer t=30; boxing

        b.next=new Box<Integer>();
        b.next.in(40);  //객체에 한번더 접근(체이닝)

        b.next.next=new Box<>();
        b.next.next.in(50);

        Box tmp;
        tmp=b.next;
        System.out.println(tmp.out());
    }
}