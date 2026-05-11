package streams.test;

import streams.dominio.Category;
import streams.dominio.Livro;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<Livro> livros = new ArrayList<>(List.of(
            new Livro("1984", 19.99, Category.DYSTOPIA),
            new Livro("Harry Potter", 15.99, Category.FANTASY),
            new Livro("A Psicologia Financeira", 10D, Category.NON_FICTION),
            new Livro("A Psicologia Financeira", 10D, Category.NON_FICTION),
            new Livro("O mesmo de sempre", 10D, Category.NON_FICTION),
            new Livro("Fahrenheit 451", 12.50, Category.DYSTOPIA),
            new Livro("A Revolução do Bichos", 9.20, Category.DYSTOPIA)
    ));

    public static void main(String[] args) {
        Map<Category, Long> count = livros.stream().collect(groupingBy(Livro::getCategory, Collectors.counting()));
        System.out.println(count);

        Map<Category, Optional<Livro>> collect = livros.stream()
                .collect(groupingBy(Livro::getCategory,
                        Collectors.maxBy(Comparator.comparing(Livro::getPrice))));
        System.out.println(collect);


        Map<Category, Livro> collect1 = livros.stream().collect(Collectors.groupingBy(Livro::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Livro::getPrice)), Optional::get)));
        System.out.println(collect1);


        Map<Category, Livro> collect2 = livros.stream().collect(Collectors.toMap(Livro::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(Livro::getPrice))));
        System.out.println(collect2);
    }
}
