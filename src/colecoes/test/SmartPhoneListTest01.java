package colecoes.test;

import colecoes.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartPhoneListTest01 {
    public static void main(String[] args) {
        List<SmartPhone> smartPhones = new ArrayList<>();
        SmartPhone sf1 = new SmartPhone("S23PL", "Samsung");
        SmartPhone sf2 = new SmartPhone("16PRO", "Apple");
        SmartPhone sf3 = new SmartPhone("12NTE", "Xiaomi");
        smartPhones.add(sf1);
        smartPhones.add(sf2);
        smartPhones.add(sf3);

        //smartPhones.clear();
        for (SmartPhone smartPhone : smartPhones) {
            System.out.println(smartPhone);
            System.out.println("------------------");
        }

        SmartPhone sf4 = new SmartPhone("12NTE", "Xiaomi");
        System.out.println(smartPhones.contains(sf4));

        smartPhones.add(0, sf4);
        int indexSf4 = smartPhones.indexOf(sf4);
        System.out.println(indexSf4);
        System.out.println(smartPhones.get(indexSf4));

    }
}
