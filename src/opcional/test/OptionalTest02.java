package opcional.test;

import opcional.dominio.Livro;
import opcional.repositorio.LivroRepositorio;

import java.util.Optional;

public class OptionalTest02 {
    static void main() {
        Optional<Livro> livroByTitle = LivroRepositorio.findByTitle("1984");
        livroByTitle.ifPresent(m -> m.setTitle(m.getTitle() + " - George Orwell"));
        System.out.println(livroByTitle);


        Livro livro = LivroRepositorio.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(livro);

        Livro livro1 = LivroRepositorio.findByTitle("Harry Potter").orElse(new Livro(4, "Harry Potter", 400));
        System.out.println(livro1);
    }
}
