package kr11.co11.bit04;


import java.util.ArrayList;

public class Main1132 {
    public static void main(String[] args){
        //List interface => <>
        ArrayList<String> a= new ArrayList<>();
        a.add(new String("aa"));    //List에 삽입
        a.add("bb");
        a.add("cc");    //List 중복저장 가능 순서 유지
        a.add("cc");    //import로 java.util.ArrayList를 참조해서 별도에 작업 없이
                        //객체 생성으로 객체를 통해 ArrayList의 함수 사용가능

        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
