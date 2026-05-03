package dates.test;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfter = LocalDateTime.now().plusYears(2).plusMinutes(4);
        LocalTime localTimeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration duration1 = Duration.between(now, nowAfter);
        Duration duration2 = Duration.between(localTimeNow, timeMinus7Hours);
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(3212));

        Duration duration4 = Duration.of(365, ChronoUnit.DAYS);
        Duration duration5 = Duration.ofDays(1);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        System.out.println(duration5);

    }
}
