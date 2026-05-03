package formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brasil:' dd 'de' MMMM 'de' YYYY ',' HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(simpleDateFormat.parse("Brasil: 01 de maio de 2026 , 13:42:59 BRT"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
