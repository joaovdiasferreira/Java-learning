package formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormaTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBr =  new Locale("pt", "BR");
        Locale localeFr = Locale.FRANCE;
        Locale localeItal = Locale.ITALY;
        Locale localeJa = Locale.JAPAN;

        NumberFormat[] numberFormat = new NumberFormat[5];
        numberFormat[0] = NumberFormat.getCurrencyInstance();
        numberFormat[1] = NumberFormat.getCurrencyInstance(localeBr);
        numberFormat[2] = NumberFormat.getCurrencyInstance(localeFr);
        numberFormat[3] = NumberFormat.getCurrencyInstance(localeItal);
        numberFormat[4] = NumberFormat.getCurrencyInstance(localeJa);

        double valor = 10_000.2342;
        for(NumberFormat nfa: numberFormat){
            System.out.println(nfa.getMaximumFractionDigits());

            //nfa.setMaximumFractionDigits(1);
            System.out.println(nfa.format(valor));
        }

        String valorString = "R$ 10.000,23";
        try {
            System.out.println(numberFormat[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
