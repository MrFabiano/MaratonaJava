package programer.dominio;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Fabiano Teixeira");
        Consumidor consumidor1 = new Consumidor("Andrea Lima");

        Manga manga = new Manga(5L, "Hellsing ultimate", 19.9, 10);
        Manga manga1 = new Manga(2L, "Dragon ball z", 19.8, 5);
        Manga manga2 = new Manga(3L, "Morny ", 15.9, 1);
        Manga manga3 = new Manga(3L, "Morny ", 15.9, 1);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor, manga1);
        consumidorMangaMap.put(consumidor1, manga3);

        for(Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }

    }
}
