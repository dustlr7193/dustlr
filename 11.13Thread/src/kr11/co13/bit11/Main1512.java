package kr11.co13.bit11;
interface A{
    void show();
}

public class Main1512 {
    public static void main(String[] args){
        A a=()->{
            System.out.println("hi");
        };
        a.show();

        a=()->{
            System.out.println("안녕");
        };
        a.show();
    }
}
