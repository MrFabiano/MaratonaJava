package programer.dominio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Fabiano Teixeira");
        Consumidor consumidor1 = new Consumidor("Andrea Lima");

        Manga manga1 = new Manga(5L, "Hellsing ultimate", 19.9, 10);
        Manga manga2 = new Manga(2L, "Dragon ball z", 19.8, 5);
        Manga manga3 = new Manga(3L, "Morny ", 15.9, 1);
        Manga manga4 = new Manga(3L, "Morny ", 15.9, 1);

        List<Manga> mangaList = List.of(manga1, manga2, manga4, manga3);
        List<Manga> mangaList2 = List.of(manga2, manga3);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaList);
        consumidorMangaMap.put(consumidor, mangaList2);

        for(Map.Entry<Consumidor, List<Manga>> entry: consumidorMangaMap.entrySet()){
            System.out.println("--------" + entry.getKey().getNome());

            for(Manga manga: entry.getValue()){
                System.out.println("---------" + manga.getNome());
            }
        }
    }
}
