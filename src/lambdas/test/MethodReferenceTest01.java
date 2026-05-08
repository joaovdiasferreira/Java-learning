package lambdas.test;

import lambdas.dominio.Serie;
import lambdas.dominio.service.SeriesComparators;

import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Serie> series = new java.util.ArrayList<>(List.of(new Serie("Suits", 100), new Serie("Smallville", 20), new Serie("The boys", 50)));
        //series.sort(((o1, o2) -> o1.getTitle().compareTo(o2.getTitle())));
        //Collections.sort(series, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));

        series.sort(SeriesComparators::compareByTitle);
        System.out.println(series);

        series.sort(SeriesComparators::compareByEpisodes);
        System.out.println(series);

    }
}
