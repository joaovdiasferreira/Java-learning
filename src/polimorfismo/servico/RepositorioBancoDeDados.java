package polimorfismo.servico;

import polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {


    @Override
    public void inserir() {
        System.out.println("Salvando em banco de dados");
    }
}
