package polimorfismo.dominio;

public class Computador extends Produto {

    public static final double TAXA_PORCENTAGEM = 0.1;
    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Computador calcular taxa: ");
        return this.preco * TAXA_PORCENTAGEM;
    }


}
