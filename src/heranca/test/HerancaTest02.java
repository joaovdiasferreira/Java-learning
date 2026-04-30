package heranca.test;

import heranca.dominio.Endereco;
import heranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 1 - Bloco de inicialização estático da superclasse é executado
        // 2 - Bloco de inicialização estático da subclasse é executado
        // 3 - Alocado espaço em memória para o objeto da superclasse
        // 4 - Cada atributo da superclasse é criado com os valores padrão ou o que for passado
        // 5 - Blocos de inicialização da superclasse são executados
        // 6 - Construtor da superclasse é executado
        // 7 - Alocado espaço em memória para o objeto da subclasse
        // 8 - Cada atributo da subclasse é criado com os valores padrão ou o que for passado
        // 9 - Blocos de inicialização da subclasse são executados
        // 10 - Construtor da subclasse é executado

        Endereco endereco = new Endereco("Rua 20 de setembro", "999000-200");
        Funcionario funcionario = new Funcionario("Jiraya", "111.222.333-44", endereco, 2000.00);

        funcionario.imprimir();

    }
}
