package colecoes.test;

import java.util.*;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("B");

        for(String s : queue){
            System.out.println(s);
        }

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
