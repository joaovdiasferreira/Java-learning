package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
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
        // .  = caractere coringa



        //String regex = "[a-zA-C]";
        String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-z])+)+";
        //String str1 = "cafeBABE";
        String str1 = "luffy@gmail.com, 123sanji@gmail.com, #@!zoro@mail.com, teste@gmail.com.br email!@gmail.com";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str1);

        System.out.println("#@!zoro@gmail.com".matches(regex));
        System.out.println("texto:  "+ str1);
        System.out.println("regex: " + regex);
        System.out.println("posições encontradas: ");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

        System.out.println(Arrays.toString(str1.split(",")));
        System.out.println(str1.split(",")[2].trim());


    }
}
