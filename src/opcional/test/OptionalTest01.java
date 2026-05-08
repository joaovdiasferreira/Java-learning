package opcional.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("String test");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        //String name = findName("joão");

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-----------");

        Optional<String> o4 = findName("João");
        String empty = o4.orElse("Not found");
        o4.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);

    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("João", "Ferreira");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
