package heranca.test;

import heranca.dominio.Endereco;
import heranca.dominio.Funcionario;
import heranca.dominio.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("7 de setembro");
        endereco.setCep("987000-000");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setCpf("100.200.300-40");
        pessoa.setEndereco(endereco);

        pessoa.imprimir();
        System.out.println("--------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Chiquinho");
        funcionario.setCpf("100.200.300-41");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4500.00);
        funcionario.imprimir();
        funcionario.relatorioPagamento();

        System.out.println("--------------");
        Funcionario f2 = new Funcionario("Joaozinho", "000.111.222-33", endereco, 4500.00);
        f2.imprimir();

    }

}
