package streams.test;

import streams.dominio.Livro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        //collect -> counting
        System.out.println((long) livros.size());
        System.out.println(livros.stream().count());
        System.out.println(livros.stream().collect(Collectors.counting()));
        System.out.println("-----------------");

        // maxBy, minMy, etc
        livros.stream().max(Comparator.comparing(Livro::getPrice)).ifPresent(System.out::println);
        livros.stream().collect(Collectors.maxBy(Comparator.comparing(Livro::getPrice))).ifPresent(System.out::println);
        System.out.println("-----------------");

        // summing
        System.out.println(livros.stream().mapToDouble(Livro::getPrice).sum());
        System.out.println(livros.stream().collect(Collectors.summingDouble(Livro::getPrice)));
        System.out.println("-----------------");

        //average
        livros.stream().mapToDouble(Livro::getPrice).average().ifPresent(System.out::println);
        System.out.println(livros.stream().collect(Collectors.averagingDouble(Livro::getPrice)));
        System.out.println("-----------------");

        //summarizing
        DoubleSummaryStatistics collect = livros.stream().collect(
                Collectors.summarizingDouble(Livro::getPrice)
        );
        System.out.println(collect);
        System.out.println("-----------------");

        //joining
        String collect1 = livros.stream()
                .map(Livro::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(collect1);
    }
}
