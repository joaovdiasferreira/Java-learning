package strings.test;

public class StringTest01 {
    public static void main(String[] args) {
        //Strings no Java são imutáveis
        String nome1 = "João Vitor"; // String constant pool
        String nome2 = "João Vitor";
        String nome = nome1.concat(" Ferreira");


        System.out.println(nome);
        System.out.println(nome == nome2);

        System.out.println(nome1);
        System.out.println(nome1 == nome2);

        System.out.println("----------");

        String nome3 = new String("João Vitor"); // 1- variável de referência; 2- objeto do tipo String; 3- string no pool de strings
        System.out.println(nome3 == nome2);
        System.out.println(nome3.intern() == nome2);


    }
}
