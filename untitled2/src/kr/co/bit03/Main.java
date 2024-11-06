package kr.co.bit03;

import java.util.Scanner;

class Arr{
    PhoneNumber ary[];
    int x;
    Arr(int x){
        ary=new PhoneNumber[x];
        x=0;
    }
    void friend(PhoneNumber p){
        ary[x++]=p;
    }
    void add(PhoneNumber p){
        ary[x++]=p;
    }
    void friend(char ch){
        Scanner sc=new Scanner(System.in);

        System.out.println("이름 : ");
        String name=sc.next();
        System.out.println("번호 : ");
        String phone=sc.next();

        switch (ch){
            case'A':
                System.out.println("전공 :");
                String major = sc.next();
                add(new School(name,phone,major));
                break;
            case 'B':
                System.out.println("직장 : ");
                String job= sc.next();
                add(new Worker(name,phone,job));
                break;
        }
    }
    void all(){
        for(int i=0;i<x;i++){
            ary[i].show();
        }
    }
}
class PhoneNumber{      //부모클래스
    String name;
    String phone;
    PhoneNumber(String name,String phone){
        this.name=name;
        this.phone=phone;
    }
    void show (){
        System.out.println("이름 : "+name);
        System.out.println("번호 : "+phone);
    }
}
class School extends PhoneNumber{
    String major;
    School(String name,String phone,String major){
        super(name, phone);
        this.major=major;
    }
    @Override
    void show() {
        super.show();
        System.out.println("전공: "+major);
    }
}
class Worker extends PhoneNumber{
    String job;
        Worker(String name,String phone,String job){
        super(name, phone);
        this.job=job;
    }

    @Override
    void show() {
        super.show();
        System.out.println("직업 : "+job);
    }
}
public class Main {
    public static void main(String[] arg){

    Arr ar=new Arr(5);

    while(true){
        System.out.println("A. 학교친구");
        System.out.println("B. 직장동료");
        System.out.println("C. 종료");
        System.out.println("D. 출력");

        System.out.println("문자열 입력해주세요");

        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        switch (c){
            case'A': ar.friend(c);
                break;
            case'B': ar.friend(c);
                break;
            case'C':
                System.out.println("종료");
                return;
            case'D':ar.all();
                break;
        }
    }
    }
}
