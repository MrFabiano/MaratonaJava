package map;

import collection.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {

    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor(1L, "Nome");
        Consumidor consumidor2 = new Consumidor(2L,"Nome Two");

        Manga manga = new Manga(1L, "Hellsing", 19.0, 12);
        Manga manga1 = new Manga(2L, "Argon", 13.0, 1);
        Manga manga2 = new Manga(3L, "Dragon ball", 15.0, 4);
        Manga manga3 = new Manga(4L, "Gorran", 12.0, 5);
        Manga manga4 = new Manga(5L, "Goku", 18.0, 7);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor, manga3);
        consumidorMangaMap.put(consumidor2, manga4);

        for(Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome() + " = " + entry.getValue().getNome());
        }
    }
}
