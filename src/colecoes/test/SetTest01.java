package colecoes.test;

import colecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Filme> filmes = new HashSet<>(); //não permite elementos duplicados
        filmes.add(new Filme(4L,"Interestelar",19.99, 0));
        filmes.add(new Filme(2L,"Perdido em Marte", 15.99, 5));
        filmes.add(new Filme(3L,"Ad Astra", 10.99, 0));
        filmes.add(new Filme(1L,"Devoradores de Estrelas", 25.99, 2));
        filmes.add(new Filme(5L,"Alien", 12.99, 0));
        filmes.add(new Filme(5L,"Alien", 14.99, 5));

        for(Filme filme: filmes){
            System.out.println(filme);
        }

    }
}
