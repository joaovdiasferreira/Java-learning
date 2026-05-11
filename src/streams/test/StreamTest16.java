package streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        //System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumLongParallelStreamIterate(num);

    }
    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long start = System.currentTimeMillis();
        for(int i = 0; i <= num; i++){
            result += i;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println(result + " " + time + " ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("Sum Stream Iterate");
        long start = System.currentTimeMillis();
        long result = Stream.iterate(1L, n -> n + 1).limit(num).reduce(0L, Long::sum);
        long time = System.currentTimeMillis() - start;
        System.out.println(result + " " + time + " ms");
    }

    private static void sumParallelStreamIterate(long num){
        System.out.println("Sum Parallel Stream Iterate");
        long start = System.currentTimeMillis();
        long result = Stream.iterate(1L, n -> n + 1).parallel().limit(num).reduce(0L, Long::sum);
        long time = System.currentTimeMillis() - start;
        System.out.println(result + " " + time + " ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("Sum Long Stream Iterate");
        long start = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long time = System.currentTimeMillis() - start;
        System.out.println(result + " " + time + " ms");
    }

    private static void sumLongParallelStreamIterate(long num){
        System.out.println("Sum Long Parallel Stream Iterate");
        long start = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long time = System.currentTimeMillis() - start;
        System.out.println(result + " " + time + " ms");
    }
}
