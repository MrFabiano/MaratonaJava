package collection.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaTest {

    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing", 19.9, 12));
        mangas.add(new Manga(3L, "Pokemon", 100.9, 15));
        mangas.add(new Manga(1L, "Dragon ball", 18.8, 4));
        mangas.add(new Manga(4L, "jiraya", 17.6, 8));
        mangas.add(new Manga(2L, "jaspion", 198.0, 2));

        for (Manga manga: mangas){
            System.out.println(manga);
        }

        System.out.println("-;--------------");

        Collections.sort(mangas);
        for(Manga manga: mangas){
            System.out.println(manga);
        }


    }
}
