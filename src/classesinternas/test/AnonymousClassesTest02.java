package classesinternas.test;


import generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNameComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTest02 {
    static void main() {
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Jetski"), new Barco("Canoa")));
        /*
        barcos.sort(new BarcoNameComparator());//it needs a comparatos
        Collections.sort(barcos);//it needs to implement comparable
        */

        barcos.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        System.out.println(barcos);

    }
}
