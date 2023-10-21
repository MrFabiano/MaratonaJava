package map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableTest {

    public static void main(String[] args) {

        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("A", "Letra A");
        navigableMap.put("D", "Letra D");
        navigableMap.put("C", "Letra C");
        navigableMap.put("B", "Letra B");
        navigableMap.put("E", "Letra E");

        for(Map.Entry<String, String> entry : navigableMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("-----IMPRIME ANTES DO C--------");
        //IMPRIME ANTES DO C
        System.out.println(navigableMap.headMap("C"));

        //REMOVE A
        System.out.println("-----REMOVE A --------");
        System.out.println(navigableMap.headMap("C").remove("A"));


        //Inlclui o C TAMBEM NA IMPRESSÃO
        System.out.println("-----Inlclui o C TAMBEM NA IMPRESSÃO --------");
        System.out.println(navigableMap.headMap("C", true));
    }
}
