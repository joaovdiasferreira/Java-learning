package colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(7);
        numeros.add(14);

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 10));


    }
}
