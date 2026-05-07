package generics.test;

import colecoes.dominio.Consumidor;
import colecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add(1L);
        lista.add("João");
        lista.add(new Consumidor("Maria"));

        for (Object object : lista) {
            //System.out.println(object);
            if(object instanceof String){
                System.out.println(object);

            } else if (object instanceof Consumidor) {
                Consumidor consumidor = (Consumidor) object;
                System.out.println(consumidor.toString());
            }else if (object instanceof Long) {
                System.out.println(object);
            }

        }

    }
}
