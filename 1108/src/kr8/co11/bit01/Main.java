package kr8.co11.bit01;

public class Main {
    public static void main(String[] args){

        //StringBuffer
        //문자의 개수에 따라 버퍼 크기를 자동으로 조종할 수 있다.
        //문자열이 같거나 문자열 작업이 많은 경우

// String :객체가 한번 값이 할당되면 공간이 변하지 않는다 불변성
//StringBuffer :한번 값이 할당된 후 다른 값이 할당되면 할당된 공간이 변한다 가변성  / 동기화 지원
//StringBuilder: 한번 값이 할당된 후 다른 값이 할당되면 할당된 공간이 변한다 가변성 /동기화 지원 안함

        StringBuffer sb = new StringBuffer("java ");

        sb.append("is very good");

       sb.insert(0,"A ");
       sb.replace(2,6,"Html ");
        System.out.println(sb);


    }
}
