package lambdas.dominio.service;

import lambdas.dominio.Serie;

public class SeriesComparators {
    public static int compareByTitle(Serie a1, Serie a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public static int compareByEpisodes(Serie a1, Serie a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public int compareByEpisodesNonStatic(Serie a1, Serie a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
