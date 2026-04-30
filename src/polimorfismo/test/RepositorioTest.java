package polimorfismo.test;

import polimorfismo.repositorio.Repositorio;
import polimorfismo.servico.RepositorioArquivo;
import polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();

        repositorio.inserir();

    }
}
