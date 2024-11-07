package kr.co.bit04;

public abstract class Phone {
    String owner;

    Phone(String owner){
        this.owner=owner;
    }
    void turnOn(){
        System.out.println("전원을 켠다");
    }
    void turnOff(){
        System.out.println("끈다");
    }
}
