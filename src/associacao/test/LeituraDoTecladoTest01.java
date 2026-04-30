package associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String text = input.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite o seu sexo (M/F): ");
        char sexo = input.next().charAt(0);

        System.out.println("nome: "+text + ", idade: "+idade + ", sexo: "+sexo);
    }
}
