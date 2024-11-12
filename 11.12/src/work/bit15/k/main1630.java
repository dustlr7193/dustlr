package work.bit15.k;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//15-9번

public class main1630 {
    public static void main(String[] args){
        Map<String,Integer>map=new HashMap<String,Integer>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name = null;
        int maxScore=0;
        int totalScore=0;

        Set<String> s=map.keySet();
        Iterator<String> it=s.iterator();
        while(it.hasNext()){
            String ki= it.next();
            int val=map.get(ki);
            totalScore+=val;
            if(val>maxScore){
                maxScore=val;
                name=ki;
            }
        }
        System.out.println(maxScore);
        System.out.println(totalScore);
        System.out.println(name);
    }
}
