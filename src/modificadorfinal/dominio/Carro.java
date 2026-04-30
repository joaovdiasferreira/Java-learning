package modificadorfinal.dominio;



public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.COMPRADOR.getNome());
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
