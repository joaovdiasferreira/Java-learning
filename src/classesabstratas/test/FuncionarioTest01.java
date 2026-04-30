package classesabstratas.test;

import classesabstratas.dominio.Desenvolvedor;
import classesabstratas.dominio.Funcionario;
import classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //Funcionario funcionario1 = new Funcionario("Zoro", 2000.00);
        Gerente gerente1 = new Gerente("Nami", 3000.00);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Luffy", 2500.00);

        gerente1.calculaBonus();
        desenvolvedor1.calculaBonus();

        //System.out.println(funcionario1);
        System.out.println(gerente1);
        gerente1.imprimir();
        System.out.println(desenvolvedor1);
        desenvolvedor1.imprimir();

    }
}
