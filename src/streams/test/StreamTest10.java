package streams.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args){
        Stream.iterate(1, i->i+2)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0,1}, n->new int[]{n[1], n[0]+n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        Stream.iterate(new int[]{0,1}, n->new int[]{n[1], n[0]+n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);


        System.out.println("--------");
        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        Stream.generate(() -> localRandom.nextInt(100))
                .limit(10)
                .forEach(System.out::println);
    }
}
