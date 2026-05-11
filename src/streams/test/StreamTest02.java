package streams.test;

import streams.dominio.Livro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<Livro> livros = new ArrayList<>(List.of(
            new Livro("1984", 19.99),
            new Livro("Harry Potter", 15.99),
            new Livro("A Psicologia Financeira", 10),
            new Livro("Fahrenheit 451", 12.50),
            new Livro("A Revolução do Bichos", 9.20)
    ));
    public static void main(String[] args) {
        List<String> stringList = livros.stream().sorted(Comparator.comparing(Livro::getTitle))
                .filter(o1 -> o1.getPrice() <= 10)
                .limit(3)
                .map(Livro::getTitle)
                .toList();

        System.out.println(stringList);

    }
}
