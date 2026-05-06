package colecoes.test;

import colecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("João Ferreira");
        Consumidor consumidor2 = new Consumidor("Tony Stark");

        NavigableMap<String, String>  map = new TreeMap<>();
        map.put("key3", "value3");
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key4", "value4");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(map.headMap("key3", true));
        System.out.println(map.ceilingEntry("key3"));
        System.out.println(map.floorEntry("key3"));
        System.out.println(map.lowerEntry("key3"));
        System.out.println(map.higherEntry("key3"));
    }
}
