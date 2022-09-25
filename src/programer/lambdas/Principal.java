package programer.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        System.out.println(palavras);
        palavras.add("Mercado ");
        palavras.add("Shopping ");
        palavras.add("Carro ");
        palavras.add("Computador ");
        palavras.add("Viagem ");
        palavras.add("Ferias ");

        //System.out.println(palavras);

//        palavras.forEach((String s)-> {
//            System.out.println(s);
//        });

        //palavras.forEach(s -> System.out.println(s));

        //palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.forEach(s -> System.out.println(s));
    }
}
