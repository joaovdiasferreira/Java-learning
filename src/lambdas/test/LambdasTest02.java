package lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest02 {
    public static void main(String[] args) {
        List<String> names = List.of("Zoro", "Luffy", "Sanji");

        List<Integer> integers = map(names, String::length);
        System.out.println(integers);

        List<String> strings = map(names, String::toUpperCase);
        System.out.println(strings);
    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for(T e: list){
            result.add(function.apply(e));
        }
        return result;
    }
}
