package polimorfismo.servico;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("-------------------");
        System.out.println("Relatório: ");
        double taxa = produto.calcularTaxa();
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Taxa: " + taxa);

        // (produto instanceof Tomate tomate) é mais simples
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }

    }
/*    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("-------------------");
        System.out.println("Relatório: ");
        System.out.println("Nome: " + computador.getNome());
        double taxa = computador.calcularTaxa();
        System.out.println("Taxa: " + taxa);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("-------------------");
        System.out.println("Relatório: ");
        System.out.println("Nome: " + tomate.getNome());
        double taxa = tomate.calcularTaxa();
        System.out.println("Taxa: " + taxa);
    }*/

}