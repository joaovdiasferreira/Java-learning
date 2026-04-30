package exceptions.exception.dominio;

import java.io.IOException;

public class Funcionario extends Pessoa {

    // NÃO PODE DECLARAR UMA EXCECÃO MAIS GENÉRICA QUE NO METODO ORIGINAL
    // PODE NÃO LANÇAR NENHUMA EXCEÇÃO
    // PODE LANÇAR UMA OU MAIS
    // NÃO PODE LANÇAR EXCEÇÃO CHECKED QUE NÃO FORAM DECLARADAS NA ORIGINAL
    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando funcionario...");

    }
}
