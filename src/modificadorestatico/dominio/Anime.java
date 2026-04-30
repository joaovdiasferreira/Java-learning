package modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        //BLOCO DE INCIALIZAÇÃO -> EXECUTADO ANTES DO CONSTRUTOR
        System.out.println("bloco de inicialização");
        Anime.episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("eles são executados na ordem em que aparecem");
    }

    {
        System.out.println("bloco não estático");
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();

    }


    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }
}
