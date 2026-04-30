package exceptions.exception.test;

import exceptions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Zoro";
        String passwordDB = "1234";
        System.out.println("Digite seu nome: ");
        String username = sc.nextLine();
        System.out.println("Digite seu senha: ");
        String password = sc.nextLine();

        if (username.equals(usernameDB) && password.equals(passwordDB)) {
            System.out.println("Login realizado com sucesso!");
        }
        else {
            throw new LoginInvalidoException("Login invalido!");
        }


    }
}
