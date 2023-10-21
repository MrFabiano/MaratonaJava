package collection.dominio;

import java.util.HashSet;
import java.util.Set;

//Não permite dados duplicados
public class SetTest {

    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Hellsing", 19.9, 12));
        mangas.add(new Manga(3L, "Pokemon", 100.9, 15));
        mangas.add(new Manga(1L, "Dragon ball", 18.8, 4));
        mangas.add(new Manga(4L, "jiraya", 17.6, 8));
        mangas.add(new Manga(2L, "jaspion", 198.0, 2));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
