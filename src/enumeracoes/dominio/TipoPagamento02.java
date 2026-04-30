package enumeracoes.dominio;

public enum TipoPagamento02 {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.1;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}
