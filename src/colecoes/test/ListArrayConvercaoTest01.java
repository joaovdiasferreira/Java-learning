package colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConvercaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        //Object objects = numeros.toArray();
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("-----------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;
        List<Integer> numerosList = Arrays.asList(numerosArray);
        numerosList.set(0, 10);
        //numerosList.add(20);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(numerosList);
        System.out.println("-----------------");

        List<Integer> numerosList2 = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList2.add(20);
        System.out.println(numerosList2);

        List<Integer> numerosList3 = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(numerosList3);



    }
}
