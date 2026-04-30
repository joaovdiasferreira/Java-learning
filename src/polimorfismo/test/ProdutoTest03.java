package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Nitro v15", 4000.00);

        //Produto produto2 = new Tomate("Tomate azul", 3999.00);

        //produto2.setDataValidade() não é disponível

        Tomate produto2 = new Tomate("Tomate azul", 100);
        produto2.setDataValidade("30/04/2026");

        CalculadoraImposto.calcularImposto(produto1);
        CalculadoraImposto.calcularImposto(produto2);

    }
}
