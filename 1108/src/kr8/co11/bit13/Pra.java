package kr8.co11.bit13;
interface Person{
    String work();
}
class Student implements Person{
    @Override
    public String work() {
        return "공부한다";
    }
}
class Worker implements Person{
    @Override
    public String work() {
        return "일한다";
    }
}
public class Pra {
    static void pr(Person p){
        System.out.println(p.work());
    }

    public static void main(String[] args){

        pr(new Worker());
        pr(new Student());
    }
}
