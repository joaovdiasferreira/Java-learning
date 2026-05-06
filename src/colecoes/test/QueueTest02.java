package colecoes.test;

import colecoes.dominio.Consumidor;
import colecoes.dominio.Filme;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Filme> filmeQueue = new PriorityQueue<>(new FilmeComparatorByPrice().reversed());
        filmeQueue.add(new Filme(4L,"Interestelar",19.99, 0));
        filmeQueue.add(new Filme(2L,"Perdido em Marte", 15.99, 5));
        filmeQueue.add(new Filme(3L,"Ad Astra", 10.99, 0));
        filmeQueue.add(new Filme(1L,"Devoradores de Estrelas", 25.99, 2));
        filmeQueue.add(new Filme(5L,"Alien", 12.99, 0));
        filmeQueue.add(new Filme(5L,"Alien 2", 12.99, 0));

        while (!filmeQueue.isEmpty()){
            System.out.println(filmeQueue.poll());
        }

    }
}
