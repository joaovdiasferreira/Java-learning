package generics.test;

import colecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest02 {
    public static void main(String[] args) {
        //type erasure
        List<String> lista = new ArrayList<>();
        lista.add("1L");
        lista.add("João");
        lista.add("Zoro");

        add(lista, new Consumidor("Ferreira"));
        for(Object object : lista){
            System.out.println(object);
        }
        System.out.println("-----------");
        for (String s : lista) {
            System.out.println(s);
        }

    }

    private static void add(List list, Consumidor consumidor) {
        list.add(consumidor);
    }
}
