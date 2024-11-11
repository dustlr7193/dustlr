package kr11.co11.bit02;
class AA{
    public String toString(){
        return ("AA");
    }
}
class BB {
    @Override
    public String toString() {
        return "BB";
    }
}
    class In {
        <T> void show(T t) {    //제네릭 메소드
            System.out.println(t);
        }
        void show(){
            System.out.println("generic");
        }
    }

    public class Main1034 {
        public static void main(String[] args) {
        AA a=new AA();
        BB b=new BB();
        In i=new In();

        i.<AA>show(a);  // AA t=a;
        i.<BB>show(b);
        i.show();

        }
    }
