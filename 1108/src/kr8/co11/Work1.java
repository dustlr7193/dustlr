package kr8.co11;

public class Work1 {
    public static void main(String[] args){
        Integer obj1=100;
        Integer obj2=100;
        Integer obj3=300;
        Integer obj4=300;

        System.out.println(obj1==obj2);
//포장 값 비교 -128~127 안에 속해 번지 비교 가능
        System.out.println(obj3==obj4);
//포장 값 비교에서는 int,byte,short의 값의 범위가 -128~127 이므로 번지 비교 불가(==은 번지를 비교)
//따라서 객체 내부의 데이터를 비교하는 equals 메소드를 사용

        System.out.println(obj3.equals(obj4));

    }
}