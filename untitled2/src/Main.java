public class Main {
    public static void main(String[] args) {
        //for 문을 이용해 같은 실행 결과

        //중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x,y) 형태로 출력하는 코드 작성
        //(단, x,y는 10 이하의 자연수)

        for (int x = 1; x <= 10; x++) { //x,y 1부터 10까지 반복
            for (int y = 1; y <= 10; y++) {
                if (4 * x + 5 * y == 60) { //주어진 방정식의 조건으로 대입
                    System.out.println("(" + x + "," + y + ")");
                    System.out.println("끝");
                    System.out.println("시작");
                }
            }
        }
    }
}