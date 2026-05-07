package generics.test;
//OBS: é possível usar quantos Generics quiser. ex:
/*
* class Generic<X,Y,X> {
*   construtor, métodos, etc
* }
*/

import generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> list = criarArrayComObjeto(new Barco("Jetski"));
        System.out.println(list);
    }

    private static <T> List<T> criarArrayComObjeto(T t) {
        return List.of(t);
    }
}


