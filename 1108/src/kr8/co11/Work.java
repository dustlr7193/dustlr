package kr8.co11;
import java.util.HashSet;

class Student{
    private String studentNum;

   public Student(String studentNum){
        this.studentNum=studentNum;
    }
    public String getStudentNum(){
       return studentNum;
    }
    @Override
    public int hashCode(){
       return studentNum.hashCode();// Integer.parseInt(studentNum)
    }
    @Override
    public boolean equals(Object obj){
       if(studentNum == getStudentNum()){
           return true;
       }else {
           return false;
       }
    }
}

public class Work {
    public static void main(String[] args){

        HashSet<Student> hashSet=new HashSet<Student>();

        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        System.out.println("저장된 Student 수: "+ hashSet.size());

    }
}
