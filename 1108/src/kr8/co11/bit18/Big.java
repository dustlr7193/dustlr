package kr8.co11.bit18;

public class Big {
    public static void main(String[] args){
       // 20,7,23,19,10,15,25,8,13 오름차순 합이 100이 안넘어야함 가장큰게 뒤
        int[] ary=new int[]{20,7,23,19,10,15,25,8,13};
        int[] arr=new int[9];
        int x=0;

        for(int i=0;i<8;i++){for(int j=0;j<9;j++){
            if(ary[i]>ary[j]){
                arr[i+1]=ary[j];
            }
            }
            System.out.println(arr[8]);
        }


    }
}
