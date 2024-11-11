package kr11.co11.bit05;

import java.util.ArrayList;

class Profile{
    String id;
    int age;

    Profile(String id,int age){
        this.id=id;
        this.age=age;
    }
}
public class Main1141 {
    public static void main(String[] args){
        ArrayList<Profile> a = new ArrayList<>();
        a.add(new Profile("aa",12)); //[0]
        a.add(new Profile("bb",17)); //[1]
        a.add(new Profile("cc",15)); //[2]

        for(int i=0;i<a.size();i++){    //size() ArrayList에 있는 객체수
            Profile p= a.get(i);
            System.out.println(p.id+" "+p.age);
        }

    }
}
