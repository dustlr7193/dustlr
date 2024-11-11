package kr11.co11.bit21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person{
   int num;
   String name;
    Person(int a,String b){
        num=a;
        name=b;
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person target)
            return target.num==num;
        else {
            return false;
        }
    }
}
public class Main1655 {
    public static void main(String[] args) {
        Set<Person> s = new HashSet<Person>();

        s.add(new Person(12, "홍길동"));

        s.add(new Person(23, "김길동"));

        s.add(new Person(12, "이길동"));

        Iterator<Person> it = s.iterator();

        while (it.hasNext()) {

            Person p = it.next();

            System.out.println(p.num + " " + p.name);
        }
    }
}