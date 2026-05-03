package dates.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        for (Map.Entry<String, String> entry : shortIds.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); // BET - SP
        }

        ZoneId zoneLos_Angeles = ZoneId.of("America/Los_Angeles");
        System.out.println(zoneLos_Angeles);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(zoneLos_Angeles);

        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(zoneLos_Angeles);
        System.out.println(zonedDateTime1);


        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        System.out.println(offsetManaus);
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

    }
}
