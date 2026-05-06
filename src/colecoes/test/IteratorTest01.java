package colecoes.test;

import colecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(4L,"Interestelar",19.99, 0));
        filmes.add(new Filme(2L,"Perdido em Marte", 15.99, 5));
        filmes.add(new Filme(3L,"Ad Astra", 10.99, 0));
        filmes.add(new Filme(1L,"Devoradores de Estrelas", 25.99, 2));
        filmes.add(new Filme(5L,"Alien", 12.99, 0));

        /*Iterator<Filme> iterator = filmes.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getQuantidade()==0){
                iterator.remove();
            }
        }*/
        filmes.removeIf(filme -> filme.getQuantidade() == 0);
        System.out.println(filmes);

    }
}
