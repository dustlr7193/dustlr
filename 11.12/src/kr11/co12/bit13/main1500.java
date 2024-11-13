package kr11.co12.bit13;

import java.util.*;
class Person{
    private String name;
    private int id;

    Person(String n,int i){
        name=n;
        id=i;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj){
        Person p=(Person) obj;
        if(p.getId()==this.id && p.getName().equals(this.name)){
       //obj에는 Person 객체로 대입되어서 get 함수로 String과 int타입으로 비교 대상과 타입 같게 해줌
         return true;
        }
        else {
            return false;
        }
    }
}
class Game{
    Scanner scanner=new Scanner(System.in);
    ArrayList<Person> a=new ArrayList<>(5);


    Game(){
      a.add(new Person("도현",123)); //[0]
      a.add(new Person("하형",456)); //[1]
      a.add(new Person("왕휘",789)); //[2]
      a.add(new Person("연식",112)); //[3]
    }
    void in(){
        while (true){
            System.out.println("이름, id 입력");
            String name=scanner.next();

            if(name.equals("stop")){
                break;
            }
            int id= scanner.nextInt();
            Person pp=new Person(name,id);

            if(a.contains(pp)){     //list에 있는 객채인지 아닌지의 여부
                System.out.println(pp.getName()+"  이미 있다");
            }else{
                a.add(pp);
            }
        }

    }
    void out(){
        while (true){
            Random r =new Random();
            int n=r.nextInt(a.size());

            Person p= a.get(n);
            String str=p.getName();

            System.out.println(str+"의 id는?");
            int id= p.getId();

            Scanner sc=new Scanner(System.in);

            int id2=sc.nextInt();

            if(id2==-1){
                break;
            }
            if(id2==id){
                System.out.println("정답");
            }else{
                System.out.println("땡!!");
            }

        }
    }
    void end(){
        System.out.println("종료");
        System.exit(0);   //프로세스 강제 종료
    }

}

public class main1500 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Game g=new Game();
        while (true){
            System.out.println("1,2,3");
            int select = scanner.nextInt();

            switch (select){
                case 1:
                    g.in();
                    break;
                case 2:
                    g.out();
                    break;
                case 3:
                    g.end();
                    break;
            }

        }

    }
}
