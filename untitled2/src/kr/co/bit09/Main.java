package kr.co.bit09;
interface Po{
    void pr(String name);
}
class Point implements Po{
    @Override
        System.out.println(name+"책은"+" "+x+"원");
    }

    @Override
        System.out.println(name);
    }
}
public class Main {
    public static void main(String[] args){
        Po p=new Point();
        p.pr(30000,"java");
        p.pr("python");
    }
}
