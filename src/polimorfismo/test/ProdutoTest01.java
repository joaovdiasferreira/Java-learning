package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Televisao;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Lenovo LOQ", 4000.00);
        Tomate tomate = new Tomate("Tomate azul", 100);
        Televisao tv = new Televisao("Samsung 43\"", 1700);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(tv);

    }
}
