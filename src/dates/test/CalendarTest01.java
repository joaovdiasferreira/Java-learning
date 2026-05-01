package dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão é o primeiro dia da semana");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.YEAR));

        calendar.add(Calendar.DAY_OF_MONTH, 5);
        calendar.roll(Calendar.HOUR, 15); // ADICIONA SEM VIRAR DIA/MES/ANO

        Date date = calendar.getTime();
        System.out.println(date);

    }
}
