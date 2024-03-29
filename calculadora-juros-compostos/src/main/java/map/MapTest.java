package map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("tekado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        System.out.println(map);

        System.out.println("-----------");
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("-----------");
        for(String value : map.values()){
            System.out.println(value);
        }

        System.out.println("---------");
        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " -  " + entry.getValue());
        }
    }
}
