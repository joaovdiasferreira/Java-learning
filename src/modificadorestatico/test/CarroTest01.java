package modificadorestatico.test;

import modificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW M4", 300);
        Carro c2 = new Carro("Mercedes AMG GT", 299);
        Carro c3 = new Carro("VW UP TSI", 450);

        System.out.println(Carro.getVelociadeLimite());
        Carro.setVelocidadeLimite(200);
        System.out.println(Carro.getVelociadeLimite());


        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
