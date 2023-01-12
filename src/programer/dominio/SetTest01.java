package programer.dominio;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Hellsing ultimate", 19.9, 10));
        mangas.add(new Manga(2L, "Dragon ball z", 19.8, 5));
        mangas.add(new Manga(3L, "Morny ", 15.9, 1));
        mangas.add(new Manga(3L, "Morny ", 15.9, 1));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
