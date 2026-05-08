package lambdas.test;

import lambdas.dominio.Serie;
import lambdas.dominio.service.SeriesComparators;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<SeriesComparators> newSeriesComparator = SeriesComparators::new;

        SeriesComparators seriesComparator = newSeriesComparator.get();

        //SeriesComparators serieComparator =  new SeriesComparators();
        List<Serie> series = new java.util.ArrayList<>(List.of(new Serie("Suits", 100), new Serie("Smallville", 20), new Serie("The boys", 50)));
        series.sort(seriesComparator::compareByEpisodesNonStatic);
        System.out.println(series);

        BiFunction<String, Integer, Serie> serieBiFunction = (title, episodes) -> new Serie(title, episodes);
        BiFunction<String, Integer, Serie> serieBiFunction2 = Serie::new;
        System.out.println(serieBiFunction2.apply("One Piece", 1000));
    }
}
