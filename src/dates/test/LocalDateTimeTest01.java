package dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate localDate = LocalDate.parse("2026-02-02");
        LocalTime localTime = LocalTime.parse("13:42:59");

        LocalDateTime ldt1 = localDate.atTime(localTime);
        LocalDateTime ldt2 = localTime.atDate(localDate);

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(now);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
