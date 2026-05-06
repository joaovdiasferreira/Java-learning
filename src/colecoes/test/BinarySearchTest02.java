package colecoes.test;

import colecoes.dominio.Filme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        FilmeByIdComparator filmeByIdComparator = new FilmeByIdComparator();
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(4L,"Interestelar",19.99));
        filmes.add(new Filme(2L,"Perdido em Marte", 15.99));
        filmes.add(new Filme(3L,"Ad Astra", 10.99));
        filmes.add(new Filme(1L,"Devoradores de Estrelas", 25.99));
        filmes.add(new Filme(5L,"Alien", 12.99));
        /*for(Filme filme : filmes) {
            System.out.println(filme);
        }*/

        //Collections.sort(filmes);
        filmes.sort(filmeByIdComparator);
        for(Filme filme : filmes) {
            System.out.println(filme);
        }

        Filme newFilme = new Filme(6L, "Homem Aranha", 17.99);
        System.out.println(Collections.binarySearch(filmes, newFilme, filmeByIdComparator));

    }
}
