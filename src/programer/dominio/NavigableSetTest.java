package programer.dominio;

import programer.strings.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;



    class SmarphoneMarcaComparator implements Comparator<Smartphone>{

        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            return o1.getMarca().compareTo(o2.getMarca());
        }
    }
public class NavigableSetTest {
        public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Hellsing ultimate", 19.9, 10));
        mangas.add(new Manga(2L, "Dragon ball z", 19.8, 5));
        mangas.add(new Manga(3L, "Morny ", 15.9, 1));
        mangas.add(new Manga(3L, "Morny ", 15.9, 1));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
