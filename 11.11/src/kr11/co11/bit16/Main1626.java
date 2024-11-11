package kr11.co11.bit16;

import java.util.HashMap;
import java.util.Scanner;

public class Main1626 {
    public static void main(String[] args){
        HashMap h=new HashMap();
        h.put("yeonsik","123");  //HasMap에 키,값 저장
        h.put("hyejin","234");
        h.put("seungmin","345");

        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("id,pw입력");
            String id=scanner.next();
            String pw=scanner.next();
            if(!h.containsKey(id)){  //hashMap에 id가 없을 경우
                System.out.println("아이디가 존재하지 않습니다.");
                continue;   //id 다시 입력
            }else{ //id가 hashMap에 있을 경우
                if(!h.get(id).equals(pw)){ //id 같지만 pw가 일치하지 않을 때
                    //get 키(id) 넣어서 같이 저장되었던 값(pw) 리턴
                    System.out.println("비번이 틀립니다.");
                }else {
                    System.out.println("로그인");
                    break;
                }
            }
        }

    }
}
