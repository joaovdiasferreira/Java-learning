package strings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("João Vitor"); //16 é o tamanho padrão quando não declarado tamanho
        s1.append(" Dias").append(" Ferreira");
        System.out.println(s1.toString());

        String s1Sub = s1.substring(0, 4); // IMPORTANTE SE ATENTAR AO RETORNO -> SUBSTRING NÃO ALTERA O OBJETO, POIS RETORNA UMA STRING
        System.out.println(s1Sub);

        System.out.println(s1.reverse());


    }
}
