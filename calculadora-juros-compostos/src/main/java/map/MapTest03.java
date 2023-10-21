package map;

import collection.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {

    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor(1L, "Fabiano");
        Consumidor consumidor2 = new Consumidor(2L,"Dev FullStack");

        Manga manga = new Manga(1L, "Hellsing", 19.0, 12);
        Manga manga1 = new Manga(2L, "Argon", 13.0, 1);
        Manga manga2 = new Manga(3L, "Dragon ball", 15.0, 4);
        Manga manga3 = new Manga(4L, "Gorran", 12.0, 5);
        Manga manga4 = new Manga(5L, "Goku", 18.0, 7);

        List<Manga> mangaList = List.of(manga2, manga1, manga3);
        List<Manga> mangaList1= List.of(manga4, manga2);

        Map<Consumidor, List<Manga>> consumidorListMap = new HashMap<>();
        consumidorListMap.put(consumidor, mangaList);
        consumidorListMap.put(consumidor2, mangaList1);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorListMap.entrySet()){
            System.out.println("-----"+ entry.getKey().getNome());
            System.out.println(entry.getValue());
            for (Manga manga5 : entry.getValue()) {
                System.out.println("-----"+ manga5);
            }

        }
    }
}
