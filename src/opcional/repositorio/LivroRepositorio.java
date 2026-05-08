package opcional.repositorio;

import opcional.dominio.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class LivroRepositorio {
    private static List<Livro> livros;
    static {
        livros = new ArrayList<>();
        livros.add(new Livro(1, "Fahrenheit 451", 300));
        livros.add(new Livro(2, "A Revolução dos Bixos", 100));
        livros.add(new Livro(3, "1984", 200));
    }

    public static Optional<Livro> findById(Integer id) {
        return findByParameter(m -> m.getId().equals(id));
    }

    public static Optional<Livro> findByTitle(String title) {
        return findByParameter(m -> m.getTitle().equals(title));
    }
    private static Optional<Livro> findByParameter(Predicate<Livro> predicate) {
        Livro livro = null;
        for (Livro livro1 : livros) {
            if(predicate.test(livro1)) {
                livro = livro1;
            }
        }
        return Optional.ofNullable(livro);
    }
}
