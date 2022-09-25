package programer.defaultmethods;

import java.util.*;

/*
DefaultMthods
 */
public class Principal {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparator = new ComparadorPorTamanho();

        palavras.add("Mercado ");
        palavras.add("Shopping ");
        palavras.add("Carro ");
        palavras.add("Computador ");
        palavras.add("Viagem ");
        palavras.add("Ferias ");

        //Collections.sort(palavras,comparator);
        palavras.sort(comparator);
//
//        for(int i = 0; i < palavras.size(); i++){
//            System.out.println("A palavra " + palavras.get(i) + "tem tamanho " + palavras.get(i).length());
//        }
        System.out.println(palavras);
    }
}
