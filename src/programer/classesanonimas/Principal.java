package programer.classesanonimas;

import programer.defaultmethods.ComparadorPorTamanho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparator =  new ComparadorPorTamanho();

        palavras.add("Mercado ");
        palavras.add("Shopping ");
        palavras.add("Carro ");
        palavras.add("Computador ");
        palavras.add("Viagem ");
        palavras.add("Ferias ");

//        Collections.sort(palavras);
//        System.out.println(palavras);

        List<String> str = palavras.stream()
                        .collect(Collectors.toList());
        System.out.println(str);

    }
}
