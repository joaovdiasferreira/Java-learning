package modificadorfinal.test;

import modificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Barba Branca");
        System.out.println(carro.COMPRADOR);

        System.out.println("-----------");
        carro.setNome("Jetta");
        carro.imprimir();



    }
}
