package kr11.co11.bit18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main15445 {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        Scanner scanner = new Scanner(System.in);
        int max=0;
        String m=" ";

        for(int i=0;i<3;i++){
            System.out.println("이름 입력");
            String name = scanner.next();
            System.out.println("나이 입력");
            int age = scanner.nextInt();
            h.put(name,age);

            if(max<age){
                m=name;
            max=age;
            }
        }

        String a=" ";
        int b=0;
        Set s=h.keySet();
        Iterator<String> it=s.iterator(); //Iterator 반복자
        while (it.hasNext()){
             a= it.next();
             b= (int) h.get(a);
        }
        System.out.println(a+" "+b);
    }
}