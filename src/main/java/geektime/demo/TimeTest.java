package geektime.demo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeTest {
    public static void main(String[] args) {
        int d=  LocalDate.now().getMonth().maxLength();
        System.out.println(d);
        System.out.println(LocalDate.now().getMonthValue());

        System.out.println( Instant.now().toEpochMilli());
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM");
       ;
        System.out.println( df.format(LocalDate.now()));
    }
}
