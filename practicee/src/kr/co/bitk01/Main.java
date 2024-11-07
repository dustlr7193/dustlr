package kr.co.bitk01;
abstract class Ab{
   abstract int total(int[] ary);
}
class Cd extends Ab{
    @Override
    int total(int[] ary) {
        int sum =0;
        for(int i=0;i<ary.length;i++){
            sum+=ary[i];
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args){
        Ab c=new Cd();

        System.out.println(c.total(new int []{1,2,3,4,5}));
    }
}
