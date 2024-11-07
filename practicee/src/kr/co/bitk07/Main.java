package kr.co.bitk07;

import java.util.InputMismatchException;
import java.util.Scanner;
class Rectangle{
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void show(){
        System.out.println(width*height);
    }

    private  int width;
    private int height;

}
public class Main extends Rectangle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            int x=0;
            int y=0;
        while (true) {
           try {
               System.out.println("너비와 높이 입력");
               System.out.println("너비");
                x = scanner.nextInt();
               System.out.println("높이");
                y =scanner.nextInt();
               break;
           }catch (InputMismatchException e){
               System.out.println("정수로 다시 입력");
               scanner.next();
               continue;
           }
        }
        Rectangle rectangle=new Rectangle( );
        rectangle.setWidth(x);
        rectangle.setHeight(y);
        rectangle.show();
        //초기화 작업
    }
}
