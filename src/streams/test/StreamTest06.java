package streams.test;

import streams.dominio.Livro;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        //livros.sort(Comparator.comparingDouble(Livro::getPrice));
        //livros.forEach(System.out::println);

        //anyMatch
        System.out.println(livros.stream().anyMatch(livro -> livro.getPrice() >= 8));
        //allMatch
        System.out.println(livros.stream().allMatch(livro -> livro.getPrice() > 0));
        //noneMatch
        System.out.println(livros.stream().noneMatch(livro -> livro.getPrice() < 0));

        System.out.println("----------");
        //findAny
        livros.stream().filter(livro -> livro.getPrice() >= 10)
                .findAny().ifPresent(System.out::println);

        //findFirst
        livros.stream().filter(livro -> livro.getPrice() >= 5)
                .sorted(Comparator.comparingDouble(Livro::getPrice))
                .findFirst().ifPresent(System.out::println);
                //it's sorted, could be replaced by min()

        livros.stream().filter(livro -> livro.getPrice() >= 5)
                .min(Comparator.comparingDouble(Livro::getPrice))
                .ifPresent(System.out::println);
    }
}
