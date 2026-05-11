package streams.test;

import streams.dominio.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamTest08 {
    private static List<Livro> livros = new ArrayList<>(List.of(
            new Livro("1984", 19.99),
            new Livro("Harry Potter", 15.99),
            new Livro("A Psicologia Financeira", 10),
            new Livro("A Psicologia Financeira", 10),
            new Livro("O mesmo de sempre", 10),
            new Livro("Fahrenheit 451", 12.50),
            new Livro("A Revolução do Bichos", 9.20)
    ));

    public static void main(String[] args) {
        livros.stream()
                .map(Livro::getPrice)
                .filter(price -> price > 10)
                .reduce(Double::sum).ifPresent(System.out::println);

        double sum = livros.stream()
                .mapToDouble(Livro::getPrice)
                .filter(price -> price > 10)
                .sum();
        System.out.println(sum);

    }
}
