package kr11.co12.bit02;

import java.util.*;

class XY{
    private int x,y;
    public XY(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return x+" "+y;
    }
}
public class Main930 {
    public static void main(String[] args){

        ArrayList<XY> a=new ArrayList<>();
        a.add(new XY(3,2));
        a.add(new XY(4,2));
        a.add(new XY(5,2));

        a.remove(1);  //인덱스 1에있는 객체삭제;

        for(int i=0;i<2;i++){
            XY xy=a.get(i);
            System.out.println(xy);
        }
        //iterator : 컬랙션 순차검색

            }
}
