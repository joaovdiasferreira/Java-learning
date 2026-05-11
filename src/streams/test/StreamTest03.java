package streams.test;

import streams.dominio.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
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
        Stream<Livro> stream = livros.stream();
        livros.forEach(System.out::println);

        long count = stream.filter(livro -> livro.getPrice() <= 10).count();
        long count2 = livros.stream().distinct().filter(livro -> livro.getPrice() <= 10).count();
        System.out.println(count);
        System.out.println(count2);
    }
}
