package generics.service;


import generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private final List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Jetski")));

    public Barco buscarBarcosDisponivel() {
        System.out.println("Buscando barcos disponiveis...");
        Barco barco = this.barcosDisponiveis.removeFirst();
        System.out.println("Alugando barco: "+ barco);
        System.out.println("Barcos disponíveis:");
        System.out.println(this.barcosDisponiveis);
        return barco;
    }

    public void devolvendoBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco...");
        this.barcosDisponiveis.add(barco);
        System.out.println("barcos disponiveis:");
        System.out.println(this.barcosDisponiveis);
    }

}
