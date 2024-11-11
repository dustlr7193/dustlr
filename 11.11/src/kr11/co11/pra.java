package kr11.co11;
class Program<T>{
  T t;
   void in(T t){
       this.t=t;
   }
   T get(){
       return t;
   }

}

class Java{
   String a;
   Java(String a){
       this.a=a;
   }
   void show(){
       System.out.println(a);
   }
}
class DB{
    String a;
    DB(String a){
       this.a=a;
    }
    void show(){
        System.out.println(a);
    }
}
public class pra {
    public static void main(String[] args){
      Program<Java> p=new Program<>();
      p.in(new Java("java"));

      Java j=p.get();
      j.show();

      Program<DB> p1=new Program<>();
      p1.in(new DB("Db"));
      DB db=p1.get();
      db.show();


    }
}
