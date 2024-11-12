package kr11.co12.bit04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class bit1005 {
    public static void main(String[] args){
        HashMap<String,String> n=new HashMap<>();
        n.put("water","물");
        n.put("apple","사과");
        n.put("java","자바");

        Set<String> keys=n.keySet();//모든 키를 set 컬랙션에 받아옴

        Iterator<String> it = keys.iterator(); //키들은 중복 불가 (Set이 중복이 안되기 때문에)

        while(it.hasNext()){
            String eng= it.next();
            String kor= n.get(eng);
            System.out.println(eng+" "+kor); //set작업 중복 불가 순서유지 안됨 수학의 집합과 유사
        }

    }
}
