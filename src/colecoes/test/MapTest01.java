package colecoes.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("vc", "você");
        map.put("tbm", "também");
        map.put("vdd", "verdade");
        System.out.println(map);

        for(String key : map.keySet()){
            System.out.println(key +": "+ map.get(key));
        }

        System.out.println("---------------");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
