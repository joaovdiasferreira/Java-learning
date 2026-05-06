package colecoes.test;

import colecoes.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome1 = "Joaozinho"; // String no pool de strings
        String nome2 = "Joaozinho";
        String nome3 = new String("Joaozinho"); // novo objeto na Heap

        //System.out.println(nome1.equals(nome3)) ;

        SmartPhone sf1 = new SmartPhone("S23P", "Samsung");
        SmartPhone sf2 = new SmartPhone("S23P", "Samsung");
        SmartPhone sf3 = sf1;
        SmartPhone sf4 = new SmartPhone("16PRO", "Apple");

        System.out.println(sf1.equals(sf2));
        System.out.println(sf1.equals(sf3));
        System.out.println(sf1.equals(sf4));


    }
}
