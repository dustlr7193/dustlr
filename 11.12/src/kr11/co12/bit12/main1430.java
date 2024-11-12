package kr11.co12.bit12;
//5. Main()을보고코드를작성해라.(c는 1~5까지 합, d는 1~10까지 합)
public class main1430 {
   public static int add(int a[],int x){ //c
       int sum=0;
       for (int i=0;i<x;i++){
           sum+=a[i];
       }return sum;
   }
    public static int add(int a[],int x,int[] b){ //d
       int sum=0;
       for(int i=0;i<x;i++){
           sum=sum+a[i]+b[i];
       }return sum;
    }


    public static void main(String[] args){
        int a[]={1,2,3,4,5};

        int b[]={6,7,8,9,10};

        int c=add(a,5);

        int d=add(a,5,b);

        System.out.println(c);

        System.out.println(d);
    }
}
