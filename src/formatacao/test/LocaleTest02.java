package formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguage = Locale.getISOLanguages();

        for (String iso : isoCountries) {
            System.out.print(iso + " | ");
        }
        System.out.println();

        for (String iso : isoLanguage) {
            System.out.print(iso + " | ");
        }

    }
}
