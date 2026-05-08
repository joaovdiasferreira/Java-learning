package lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Zoro", "Luffy", "Sanji");
        forEach(names, s -> System.out.println(s));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        forEach(numbers, i -> System.out.println(i));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for(T e: list) {
            consumer.accept(e);
        }
    }
}
