package strings.test;

public class StringTest02 {
    public static void main(String[] args) {

        String nome1 = "Zoro";
        String numeros1 = "012345";
        String nome2 = "       Zoro        ";

        try {
            System.out.println(nome1.charAt(1));
        } catch (IndexOutOfBoundsException e){
            //e.printStackTrace();
            throw new IndexOutOfBoundsException("Indice invalido");
        }

        System.out.println(nome1.replace('Z', 'Y'));
        System.out.println(nome1.contains("Z"));
        System.out.println(nome1.toLowerCase());
        System.out.println(nome1.toUpperCase());
        System.out.println("--------------");
        System.out.println(numeros1.length());
        System.out.println(numeros1.substring(0, 3)); //substring(a,b): from a -> b - 1
        System.out.println("--------------");
        System.out.println(nome2);
        System.out.println(nome2.trim());

    }
}
