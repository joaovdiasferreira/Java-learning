package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // \d = dígitos
        // \D = não dígitos
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracteres que não estão em branco
        // \w = a-ZA-Z, dígitos, _
        // \W = tudo que não for incluso no \w
        // [] = range de caractéres



        String regex = "\\W";
        String str1 = "abaaba";
        String str2 = "abababa";
        String str3 = "@!$as_32a23 ajl\t4rasd";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str3);

        System.out.println("texto:  "+ str3);
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas: ");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }



    }
}
