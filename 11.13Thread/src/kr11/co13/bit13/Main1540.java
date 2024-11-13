package kr11.co13.bit13;

import java.util.Random;

class Account{
    int money=3000;

  synchronized void deposit(int n){
        money+=n;
      System.out.println("d: "+money);
    }
   synchronized void withdraw(int n){
        if(money>n){
            money-=n;
            System.out.println("w: "+money);
        }else {
            System.out.println("잔액 부족");
        }
    }
    int show(){
        return money;
    }

}
class Bank implements Runnable{
    Account account;
    Random r=new Random();
    Bank(Account account){
        this.account=account;
    }
    @Override
    public void run() {
      for(int i=0;i<3;i++){
          int n=r.nextInt(1000)+1;
          if(r.nextBoolean()){
              account.deposit(n);
          }else{
              account.withdraw(n);
          }
          try {
              Thread.sleep(1000);
          }catch (Exception e){

          }
      }
    }
}

public class Main1540 {
    public static void main(String[] args){

        Account account = new Account();

        Thread t1=new Thread(new Bank(account),"홍 길동");  // "홍길동" String은 Thread에 대입되는 변수라 Runnable을 implements한 Bank 클래스에는
        Thread t2=new Thread(new Bank(account),"김길동");  // 필드로 선언해서 생성자 초기화 할 필요없다
        Thread t3=new Thread(new Bank(account),"박길동");

        t1.start();
        t2.start();
        t3.start();

        //모든 스레드가 완료될때까지 대기
        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (Exception e){

        }
        System.out.println(account.show());
    }
}
