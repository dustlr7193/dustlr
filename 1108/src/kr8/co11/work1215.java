package kr8.co11;
//12월 31일까지 몇일 남았는지
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class work1215 {
    public static void main(String[] args){
        LocalDateTime start=LocalDateTime.of(2024,11,8,20,56);
        LocalDateTime end=LocalDateTime.of(2024,12,31,1,1);

        long remainDay=start.until(end, ChronoUnit.DAYS);
        System.out.println(remainDay);
    }
}
