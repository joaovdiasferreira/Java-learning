package dates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(13, 42, 59);
        LocalTime now  = LocalTime.now();

        System.out.println(localTime);
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
    }
}
