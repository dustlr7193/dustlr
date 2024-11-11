package kr11.co11.bit06.Main;

import java.util.Scanner;

interface Cal{

    public int cal(int a,int b);

}
class Show implements Cal {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int sum = 0;

    public int cal(int a, int b) {
        this.a = a;
        this.b = b;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public Show() {
        cal(a,b);
    }
}
public class work {
    public static void main(String[] args){

        Cal c= new Show();

        int a = 0;
        int b=0;
        System.out.println(c.cal(a,b));
    }
}
