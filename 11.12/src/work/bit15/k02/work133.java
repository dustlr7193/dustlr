package work.bit15.k02;
class Container<T,K>{
    T t;
    K k;

    public void set(T t,K k) {
        this.t =t;
        this.k=k;
    }

    public T getKey() {
        return t;
    }

    public K getValue() {
        return k;
    }
}
public class work133 {
    public static void main(String[] args){
    Container<String,String> container1= new Container<String,String>();
    container1.set("홍길동","도적");
    String name1=container1.getKey();
    String job=container1.getValue();

        Container<String,Integer> container2= new Container<String,Integer>();
        container2.set("홍길동",35);
        String name2=container2.getKey();
        int age=container2.getValue();

        System.out.println(name1+" "+job);
        System.out.println(name2+" "+age);

    }
}
