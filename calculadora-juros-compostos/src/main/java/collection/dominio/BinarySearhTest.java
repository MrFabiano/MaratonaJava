package collection.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearhTest {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing", 19.9, 1));
        mangas.add(new Manga(3L, "Pokemon", 100.9, 2));
        mangas.add(new Manga(1L, "Dragon ball", 18.8, 3));
        mangas.add(new Manga(4L, "jiraya", 17.6, 4));
        mangas.add(new Manga(2L, "jaspion", 198.0, 5));

        for (Manga manga: mangas){
            System.out.println(manga);
        }

        System.out.println("-;--------------");

        Collections.sort(mangas);
        for(Manga manga: mangas){
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(4L, "jiraya", 17.6, 4);
        System.out.println("--------BinarySearch------------------");
        System.out.println(Collections.binarySearch(mangas, mangaSearch));


    }
}
