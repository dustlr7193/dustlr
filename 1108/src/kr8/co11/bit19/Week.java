package kr8.co11.bit19;

import javax.naming.InsufficientResourcesException;

class Account{
    private long balance;

    public Account(){}

    public long getBalance() {
        return balance;
    }
    public void desposit(int money){
        balance+=money;
    }
    public void withdraw(int money)throws InsufficientResourcesException {
        if(balance<money){
            throw new InsufficientResourcesException("잔고부족 "+(money-balance)+" 모자람");
        }
        balance-=money;
    }
}
public class Week  {
    public static void main(String[] args) {
        Account account=new Account();

        account.desposit(10000);
        System.out.println("예금액: "+account.getBalance());

        try {
            account.withdraw(30000);
        }catch (InsufficientResourcesException e){
            String message= e.getMessage();
            System.out.println(message);
        }
    }
}