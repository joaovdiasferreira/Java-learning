package enumeracoes.dominio;

public class Cliente02 {
    public enum TipoPagamento{
            DEBITO, CREDITO
    }


    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;


    public Cliente02(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente02{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getDescricao() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}