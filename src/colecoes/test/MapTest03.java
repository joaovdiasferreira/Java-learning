package colecoes.test;

import colecoes.dominio.Consumidor;
import colecoes.dominio.Filme;

import java.util.*;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("João Ferreira");
        Consumidor consumidor2 = new Consumidor("Tony Stark");

        Filme filme1 = new Filme(4L, "Interestelar", 19.99, 0);
        Filme filme2 = new Filme(2L, "Perdido em Marte", 15.99, 5);
        Filme filme3 = new Filme(3L, "Ad Astra", 10.99, 0);
        Filme filme4 = new Filme(1L, "Devoradores de Estrelas", 25.99, 2);
        Filme filme5 = new Filme(5L, "Alien", 12.99, 0);

        List<Filme> filmesConsumidor1 = List.of(filme1, filme2, filme3);
        List<Filme> filmesConsumidor2 = List.of(filme4, filme5, filme3);

        Map<Consumidor, List<Filme>> consumidorFilmeMap = new HashMap<>();
        consumidorFilmeMap.put(consumidor1, filmesConsumidor1);
        consumidorFilmeMap.put(consumidor2, filmesConsumidor2);

        for(Map.Entry<Consumidor, List<Filme>> entry : consumidorFilmeMap.entrySet()) {
            System.out.print(entry.getKey().getNome() + ": ");
            for (Filme filme : entry.getValue()) {
                System.out.print(filme.getNome()+ " | ");
            }
            System.out.println();
        }

    }
}
