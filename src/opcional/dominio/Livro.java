package opcional.dominio;

public class Livro {
    private Integer id;
    private String title;
    private int pages;

    public Livro(Integer id, String title, int pages) {
        this.id = id;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
}
