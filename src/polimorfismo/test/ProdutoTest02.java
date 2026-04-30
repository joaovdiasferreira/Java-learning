package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Nitro v15", 4000.00);

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Taxa: " + produto1.calcularTaxa());
        System.out.println("---------------");

        Produto produto2 = new Tomate("Tomate azul", 3999.00);

        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preço: " + produto2.getPreco());
        System.out.println("Taxa: " + produto2.calcularTaxa());
        System.out.println("---------------");

        //produto2.setDataValidade() não é disponível



    }
}
