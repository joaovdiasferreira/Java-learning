package colecoes.test;

import colecoes.dominio.Consumidor;
import colecoes.dominio.Filme;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("João Ferreira");
        Consumidor consumidor2 = new Consumidor("Tony Stark");
        System.out.println(consumidor1);

        Filme filme1 = new Filme(4L, "Interestelar", 19.99, 0);
        Filme filme2 = new Filme(2L, "Perdido em Marte", 15.99, 5);
        Filme filme3 = new Filme(3L, "Ad Astra", 10.99, 0);
        Filme filme4 = new Filme(1L, "Devoradores de Estrelas", 25.99, 2);
        Filme filme5 = new Filme(5L, "Alien", 12.99, 0);

        Map<Consumidor, Filme> consumidorFilmeMap = new HashMap<>();
        consumidorFilmeMap.put(consumidor1, filme1);
        consumidorFilmeMap.put(consumidor2, filme2);

        for(Map.Entry<Consumidor, Filme> entry : consumidorFilmeMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + ": " + entry.getValue().getNome());
        }

    }
}
