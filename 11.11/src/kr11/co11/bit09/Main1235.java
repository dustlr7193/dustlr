package kr11.co11.bit09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1235 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(); //()에 적으면 ArrayList 공간을 정함

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.size(); i++) {
            a.add(scanner.next());
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));  //입력한 순서대로 출력 get() 리스트에서 i해당 인덱스의 값 읽기
        }
        int max = 0;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(max).length() >= a.get(i).length()) {
                max = i;
            }
            System.out.println(a.get(max));
        }
    }
}
