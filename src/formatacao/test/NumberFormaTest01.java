package formatacao.test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormaTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBr =  new Locale("pt", "BR");
        Locale localeFr = Locale.FRANCE;
        Locale localeItal = Locale.ITALY;

        NumberFormat[] numberFormat = new NumberFormat[4];
        numberFormat[0] = NumberFormat.getInstance();
        numberFormat[1] = NumberFormat.getInstance(localeBr);
        numberFormat[2] = NumberFormat.getInstance(localeFr);
        numberFormat[3] = NumberFormat.getInstance(localeItal);

        double valor = 10_000.2342;
        for(NumberFormat nfa: numberFormat){
            System.out.println(nfa.format(valor));
        }

        String valorString = "1.000,2431";
        try {
            System.out.println(numberFormat[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
