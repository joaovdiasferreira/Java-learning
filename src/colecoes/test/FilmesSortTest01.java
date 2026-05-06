package colecoes.test;

import colecoes.dominio.Filme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FilmeByIdComparator implements Comparator<Filme> {

    @Override
    public int compare(Filme f1, Filme f2) {
        return f1.getId().compareTo(f2.getId());
    }
}

public class FilmesSortTest01 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(4L,"Interestelar",19.99));
        filmes.add(new Filme(2L,"Perdido em Marte", 15.99));
        filmes.add(new Filme(3L,"Ad Astra", 10.99));
        filmes.add(new Filme(1L,"Devoradores de Estrelas", 25.99));
        filmes.add(new Filme(5L,"Alien", 12.99));

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        System.out.println("Ordenando por nome:");

        Collections.sort(filmes);
        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.println("----------------");
        //Collections.sort(filmes, new FilmeByIdComparator());
        filmes.sort(new FilmeByIdComparator());
        for (Filme filme : filmes) {
            System.out.println(filme);
        }


    }
}
