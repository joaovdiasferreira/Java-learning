package enumeracoes.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    private int valor;
    private String descricao;

    TipoCliente(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;

    }

    public static TipoCliente tipoClientePorDescricao(String descricao) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getDescricao().equals(descricao)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValor() {
        return valor;
    }
}
