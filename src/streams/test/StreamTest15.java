package streams.test;

import streams.dominio.Category;
import streams.dominio.Livro;
import streams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static streams.dominio.Promotion.*;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = livros.stream().collect(groupingBy(Livro::getCategory, summarizingDouble(Livro::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = livros.stream().collect(groupingBy(Livro::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);


        Map<Category, LinkedHashSet<Promotion>> collect2 = livros.stream().collect(groupingBy(Livro::getCategory, mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }
    private static Promotion getPromotion(Livro livro) {
        return livro.getPrice() <= 10 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
