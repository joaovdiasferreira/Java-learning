package polimorfismo.dominio;

public class Tomate extends Produto {

    public static final double TAXA_PORCENTAGEM = 0.05;
    private String dataValidade;

    public Tomate(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularTaxa() {
        System.out.println("Calculando Taxa de Tomate");
        return this.preco * TAXA_PORCENTAGEM;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
