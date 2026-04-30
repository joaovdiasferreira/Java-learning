package associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Software de previsão do futuro----");
        System.out.println("Digite uma pergunta eu respondo com S/N");
        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
