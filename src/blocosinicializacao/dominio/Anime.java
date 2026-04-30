package blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        //BLOCO DE INCIALIZAÇÃO -> EXECUTADO ANTES DO CONSTRUTOR
        System.out.println("bloco de inicialização");
        this.episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }



    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println("\n");

    }


    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
