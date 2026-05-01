package dates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // É UMA CLASSE MUITO DEPRECIADA, MAS PODE APARECER EM SISTEMAS LEGADOS
        Date date = new Date(1777638888261L); // long (em ms) -> 01/01/1970
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);

    }
}
