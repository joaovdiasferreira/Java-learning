package streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> escola = new ArrayList<>();
        List<String> turma1 = new ArrayList<>(List.of("Naruto", "Sasuke", "Sakura"));
        List<String> turma2 = new ArrayList<>(List.of("Luffy", "Zoro", "Sanji"));

        escola.add(turma1);
        escola.add(turma2);

/*        for (List<String> turma : escola) {
            for (String aluno : turma) {
                System.out.println(aluno);
            }
        }*/

        escola.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
