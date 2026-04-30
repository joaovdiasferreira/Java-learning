package associacao.dominio;

public class Time {
    private String nome;
    private Jogador[]  jogadores;

    public Time(String nome) {
        this.nome = nome;
    }
    public Time(String nome, Jogador[] jogadores) {
        this(nome);
        this.jogadores = jogadores;
    }

    public void imprimir(){
        System.out.println("Time: " + this.nome);
        if  (jogadores == null) return;
        System.out.println("Jogadores: ");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}

