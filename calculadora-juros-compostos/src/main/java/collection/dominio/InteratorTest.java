package collection.dominio;

import java.util.ArrayList;
import java.util.List;

public class InteratorTest {

    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing", 19.9, 12));
        mangas.add(new Manga(3L, "Pokemon", 100.9, 15));
        mangas.add(new Manga(1L, "Dragon ball", 18.8, 4));
        mangas.add(new Manga(4L, "jiraya", 17.6, 8));
        mangas.add(new Manga(2L, "jaspion", 198.0, 2));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if(mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//            System.out.println(mangas);

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
        }
    }

