package generics.service;


import generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private final List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscarCarrosDisponivel() {
        System.out.println("Buscando carros disponiveis...");
        Carro carro = this.carrosDisponiveis.removeFirst();
        System.out.println("Alugando carro: "+ carro);
        System.out.println("Carros disponíveis:");
        System.out.println(this.carrosDisponiveis);
        return carro;
    }

    public void devolvendoCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro...");
        this.carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis:");
        System.out.println(this.carrosDisponiveis);
    }

}
