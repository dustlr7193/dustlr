package kr11.co11.bit07;

class Gen<T> { // 필드 틀림
    String a;
    String b;

    Gen(String a, String b) {   //함수 호출 틀림
        this.a = a;
        this.b = b;
    }

    String one() {      //
        return "seoul";
    }

    String two() {      //반환 타입 땡
        return "busan";
    }

    boolean three() {
        if (two().equals(one())) {
            return true;
        } else {
            return false;
        }

    }
}

    public class Main12212 {
        public static void main(String[] args) {
            Gen<String> g = new Gen<String>("seoul", "busan");

            System.out.println(g.one()); //seoul 출력

            System.out.println(g.two()); //busan 출력

            System.out.println(g.three()); //false 출력 (두 문자열 비교)
        }

    }
