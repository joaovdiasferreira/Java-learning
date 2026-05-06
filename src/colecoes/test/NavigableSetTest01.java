package colecoes.test;

import colecoes.dominio.Filme;
import colecoes.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class FilmeComparatorByPrice implements Comparator<Filme>{
    @Override
    public int compare(Filme o1, Filme o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}


class SmartPhoneComparatorSerial implements Comparator<SmartPhone>{
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getSerialNumber().compareTo(o2.getSerialNumber());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<SmartPhone> set = new TreeSet<>(new SmartPhoneComparatorSerial());
        SmartPhone smartPhone1 = new SmartPhone("1234", "Epou");
        set.add(smartPhone1);

        NavigableSet<Filme> filmes = new TreeSet<>(new FilmeComparatorByPrice());
        filmes.add(new Filme(4L,"Interestelar",19.99, 0));
        filmes.add(new Filme(2L,"Perdido em Marte", 15.99, 5));
        filmes.add(new Filme(3L,"Ad Astra", 10.99, 0));
        filmes.add(new Filme(1L,"Devoradores de Estrelas", 25.99, 2));
        filmes.add(new Filme(5L,"Alien", 12.99, 0));
        filmes.add(new Filme(5L,"Alien 2", 12.99, 0));
        filmes.add(new Filme(5L,"Alien 2", 5.99, 0));
        for(Filme filme : filmes){
            System.out.println(filme);
        }

        System.out.println("---------------");
        for(Filme filme : filmes.descendingSet()){
            System.out.println(filme);
        }

        System.out.println("---------------");
        // lower (<), floor(<=), higher(>), ceiling(>=)
        Filme jurassicPark = new Filme(6L,"Jurassic Park",10.99, 5);
        System.out.println(filmes.lower(jurassicPark));
        System.out.println(filmes.floor(jurassicPark));
        System.out.println(filmes.higher(jurassicPark));
        System.out.println(filmes.ceiling(jurassicPark));
        System.out.println("-----------");

        System.out.println(filmes.size());
        System.out.println(filmes.pollFirst());
        System.out.println(filmes.pollLast());
        System.out.println(filmes.size());
    }
}
