package generics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetosDisponivel() {
        System.out.println("Buscando objetos disponiveis...");
        T t = this.objetosDisponiveis.removeFirst();
        System.out.println("Alugando objeto: "+ t);
        System.out.println("Objetos disponíveis:");
        System.out.println(this.objetosDisponiveis);
        return t;
    }

    public void devolvendoObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto...");
        this.objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis:");
        System.out.println(this.objetosDisponiveis);
    }
}
