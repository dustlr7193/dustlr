package work.bit15.k01;
//13-2

import java.awt.*;
class Container<T>{
     T t;
     public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

public class work132 {
    public static void main(String[] args){

        Container<String> container1=new Container<String>();
        container1.set("홍길동");
        String str=container1.get();

        Container<Integer> container2=new Container<Integer>();
        container2.set(6);
        int value = container2.get();

    }
}