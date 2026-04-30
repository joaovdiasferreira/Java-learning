package polimorfismo.dominio;

public class Televisao extends Produto{

    public static final double TAXA_PORCENTAGEM = 0.15;

    public Televisao(String nome, double preco) {
        super(nome, preco);
    }


    @Override
    public double calcularTaxa() {
        System.out.println("Calculando Taxa de Televisão");
        return this.preco * TAXA_PORCENTAGEM;
    }
}
