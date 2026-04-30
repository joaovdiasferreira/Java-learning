package exceptions.exception.test;


import exceptions.exception.dominio.Funcionario;
import exceptions.exception.dominio.LoginInvalidoException;
import exceptions.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest01 {
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();

        try {
            f.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }


    }
}
