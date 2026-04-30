package polimorfismo.servico;

import polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {


    @Override
    public void inserir() {
        System.out.println("Salvando em memória");
    }
}
