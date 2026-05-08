package lambdas.test;

import lambdas.dominio.Serie;
import lambdas.dominio.service.SeriesComparators;

import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        SeriesComparators serieComparator =  new SeriesComparators();
        List<Serie> series = new java.util.ArrayList<>(List.of(new Serie("Suits", 100), new Serie("Smallville", 20), new Serie("The boys", 50)));

        //series.sort((a1, a2) -> serieComparator.compareByEpisodesNonStatic(a1, a2));
        series.sort(serieComparator::compareByEpisodesNonStatic);
        System.out.println(series);
    }
}
