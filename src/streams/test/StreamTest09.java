package streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter(n->n%2==0).forEach(System.out::println);
        System.out.println("------------");
        IntStream.range(1,50).filter(n->n%2==0).forEach(System.out::println);
        System.out.println("------------");

        Stream.of("Led", " dá", " mais", " fps")
                .map(String::toUpperCase)
                .forEach(System.out::print);
        System.out.println("------------");

        int num[] = {1,2,3,4,5};
        Arrays.stream(num).average().ifPresent(System.out::println);
        System.out.println("------------");

        try(Stream<String> lines = Files.lines(Paths.get("text.txt"))) {
            lines
                    .filter(ln->ln.contains("Java"))
                    .forEach(System.out::println);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
