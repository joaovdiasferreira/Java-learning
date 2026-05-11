package streams.test;

import streams.dominio.Category;
import streams.dominio.Livro;
import streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<Livro>> collect = livros.stream().collect(Collectors.groupingBy(
                ln -> {return ln.getPrice() <= 10 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;}));

        System.out.println(collect);
        //Map<Category, Map<Promotion, List<Livros>>>
        Map<Category, Map<Promotion, List<Livro>>> collect1 = livros.stream().collect(Collectors.groupingBy(Livro::getCategory,
                Collectors.groupingBy(ln -> {
                    return ln.getPrice() <= 10 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                })));
        System.out.println(collect1);
    }
}
