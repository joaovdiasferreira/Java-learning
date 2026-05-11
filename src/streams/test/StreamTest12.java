package streams.test;

import streams.dominio.Category;
import streams.dominio.Livro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
/*        Map<Category, List<Livro>> categoryListMap = new HashMap<>();
        List<Livro> fantasyLivros = new ArrayList<>();
        List<Livro> nonFictionLivros = new ArrayList<>();
        List<Livro> dystopiaLivros = new ArrayList<>();

        for (Livro livro : livros) {
            switch (livro.getCategory()) {
                case DYSTOPIA: dystopiaLivros.add(livro); break;
                case NON_FICTION: nonFictionLivros.add(livro); break;
                case FANTASY: fantasyLivros.add(livro); break;
            }
        }

        categoryListMap.put(Category.DYSTOPIA, dystopiaLivros);
        categoryListMap.put(Category.NON_FICTION, nonFictionLivros);
        categoryListMap.put(Category.FANTASY, fantasyLivros);
        System.out.println(categoryListMap);*/

        Map<Category, List<Livro>> collect = livros.stream().collect(Collectors.groupingBy(Livro::getCategory));
        System.out.println(collect);
    }
}
