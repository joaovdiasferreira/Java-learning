package lambdas.dominio;

public class Serie {
    private String Title;
    private int episodes;

    public Serie(String title, int episodes) {
        Title = title;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Series{" +
                "Title='" + Title + '\'' +
                ", quantity=" + episodes +
                '}';
    }

    public String getTitle() {
        return Title;
    }

    public int getEpisodes() {
        return episodes;
    }
}
