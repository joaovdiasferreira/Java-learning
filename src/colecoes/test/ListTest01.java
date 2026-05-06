package colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        //List nomes = new ArrayList(); //1.4

        // List<Objeto>, List<int> (tipos primitivos) não pode
        List<String>nomes = new ArrayList<>(16);
        List<String>nomes2 = new ArrayList<>(16);

        nomes.add("Joaozinho");
        nomes.add("Curso Java");
        //nomes.add(121);
        nomes.remove("Joaozinho");
        //nomes.remove(0);

        nomes2.add("Ferreira");
        nomes2.add("OOP");

        nomes.addAll(nomes2);

        for(String nome : nomes) {
            System.out.println(nome);
        }
        nomes.add("Zoro");
        System.out.println("-----------");
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("-----------");
        int size = nomes.size();
        for(int i = 0; i < size; i++) {
            nomes.add("Zoro");
            System.out.println(nomes.get(i));
        }
        System.out.println(nomes);

        List <Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        System.out.println(numeros);
    }
}
