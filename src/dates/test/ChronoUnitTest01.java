package dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate aniversario = LocalDate.of(2007, Month.AUGUST, 28);
        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDate.now()));
    }
}
