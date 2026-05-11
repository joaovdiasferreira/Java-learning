package streams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        Integer reduce = integers.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        System.out.println("---------------------");
        integers.stream().reduce((a, b)-> a*b).ifPresent(System.out::println);
        Integer reduce1 = integers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce1);

        System.out.println("---------------------");
        integers.stream().reduce((x, y) -> x > y ? x : y)
                .ifPresent(System.out::println);

        integers.stream().reduce(Integer::max).ifPresent(System.out::println);


    }
}
