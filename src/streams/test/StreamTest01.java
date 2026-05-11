package streams.test;

import streams.dominio.Livro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<Livro> livros = new ArrayList<>(List.of(
            new Livro("1984", 19.99),
            new Livro("Harry Potter", 15.99),
            new Livro("A Psicologia Financeira", 10),
            new Livro("Fahrenheit 451", 12.50),
            new Livro("A Revolução do Bichos", 9.20)
    ));
    public static void main(String[] args) {
        livros.sort(Comparator.comparing(Livro::getTitle));
        System.out.println(livros);

        List<String> titles = new ArrayList<>();
        for(Livro livro : livros){
            if (livro.getPrice()<=10) titles.add(livro.getTitle());
            if (titles.size() == 3) break;
        }
        System.out.println(titles);

    }
}
