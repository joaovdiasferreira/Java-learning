package enumeracoes.test;

import enumeracoes.dominio.Cliente02;
import enumeracoes.dominio.Cliente02.TipoPagamento;
import enumeracoes.dominio.TipoCliente;
import enumeracoes.dominio.TipoPagamento02;

public class ClienteTest02 {
    public static void main(String[] args) {
        Cliente02 cliente = new Cliente02("Joãozinho", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente);

        System.out.println(TipoPagamento02.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento02.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorDescricao("Pessoa Física");
        System.out.println(tipoCliente);
    }
}
