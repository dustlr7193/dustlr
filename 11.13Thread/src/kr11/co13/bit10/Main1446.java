package kr11.co13.bit10;
interface Calculable{
    void calculate(int x,int y);
}

public class Main1446 {
    static void action(Calculable calculable){
        int x=10;
        int y=4;
        calculable.calculate(x,y);
    }
    public static void main(String[] args){

        action((x,y)->{
            int result = x+y;
            System.out.println("result "+result);
        });
        action((x,y)->{
            int result=x-y;
            System.out.println("result "+result);
        });

    }
}
