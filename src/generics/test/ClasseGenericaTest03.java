package generics.test;

import generics.dominio.Barco;
import generics.dominio.Carro;
import generics.service.BarcoRentavelService;
import generics.service.CarroRentavelService;
import generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Jetski")));

        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> barcoRentalService = new RentalService<>(barcosDisponiveis);
        Carro carro = carroRentalService.buscarObjetosDisponivel();
        System.out.println("\nusando carro por um tempo\n");
        carroRentalService.devolvendoObjetoAlugado(carro);
        System.out.println("--------------------");

        Barco barco = barcoRentalService.buscarObjetosDisponivel();
        System.out.println("\nusando barco por um tempo\n");
        barcoRentalService.devolvendoObjetoAlugado(barco);
    }
}
