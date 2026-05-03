package dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        data = data.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println(data);


        data = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(data);
        data = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(data);
        data = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(data);
        data = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(data);
    }
}
