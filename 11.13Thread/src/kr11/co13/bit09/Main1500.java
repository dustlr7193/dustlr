package kr11.co13.bit09;
@FunctionalInterface
interface Fun{
    int cal(int x, int y);
}
public class Main1500 {
    public static void main(String[] args){
        Fun f=(x,y) ->{     //람다식
            return x+y;
        };
        System.out.println(f.cal(1,2));

        Fun f2=(x,y)-> x+y;
        System.out.println(f2.cal(5,9));
    }
}
