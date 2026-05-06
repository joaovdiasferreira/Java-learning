package colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> filmes =  new ArrayList<>();
        filmes.add("Interestelar");
        filmes.add("Perdido em Marte");
        filmes.add("Ad Astra");
        filmes.add("Devoradores de Estrelas");
        filmes.add("Alien");

        Collections.sort(filmes);
        for(String film: filmes){
            System.out.println(film);
        }

        List<Double> vendas = new ArrayList<>();
        vendas.add(101.52);
        vendas.add(97.23);
        vendas.add(5.99);
        vendas.add(10D);

        Collections.sort(vendas);
        for(Double venda: vendas){
            System.out.println(venda);
        }

    }
}
