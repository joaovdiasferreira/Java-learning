package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = dígitos
        // \D = não dígitos
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracteres que não estão em branco
        // \w = a-ZA-Z, dígitos, _
        // \W = tudo que não for incluso no \w
        // [] = range de caracteres
        // ?  = zero ou uma ocorrência
        // *  = zero ou mais ocorrências
        // +  = uma ou mais ocorrência
        // {m,n} = de m até n
        // () = agrupamento
        // |  = ou
        // $  = fim da linha



        //String regex = "[a-zA-C]";
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        //String str1 = "cafeBABE";
        String str1 = "12 0x 0X 0xFFABC 0X10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str1);

        System.out.println("texto:  "+ str1);
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas: ");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }



    }
}
