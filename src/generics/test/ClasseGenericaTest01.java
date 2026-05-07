package generics.test;

import generics.dominio.Carro;
import generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarrosDisponivel();
        System.out.println("\nusando carro por um tempo\n");
        carroRentavelService.devolvendoCarroAlugado(carro);
    }
}
