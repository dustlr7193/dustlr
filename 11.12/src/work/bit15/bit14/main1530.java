package work.bit15.bit14;

import java.util.HashSet;
import java.util.Set;
//15-8
class Student{
    public int studentNum;
    public String name;

    public Student (int studentNum, String name){
        this.studentNum=studentNum;
        this.name=name;
    }
    @Override
    public int hashCode(){
        return studentNum;
    }
    @Override
    public boolean equals(Object obj){
     Student student=(Student) obj;
     if(student.studentNum==this.studentNum){
         return true;
     }
     return false;
    }
}

public class main1530 {
    public static void main(String[] args){

        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1,"홍길동"));
        set.add(new Student(2,"신용권"));
        set.add(new Student(1,"조민우"));

        System.out.println("저장된 객체 수: "+set.size());
        for(Student s: set){
            System.out.println(s.studentNum+" "+s.name);
        }
    }
}
