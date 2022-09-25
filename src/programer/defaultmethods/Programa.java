package programer.defaultmethods;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
//
//        Teste t = new MinhaClasse();
//
//        System.out.println(t.mensagem());
//
//        t.meu_metodo();


        List<String> palavras = new ArrayList<String>();

        System.out.println(palavras);
        palavras.add("Mercado ");
        palavras.add("Shopping ");
        palavras.add("Carro ");
        palavras.add("Computador ");
        palavras.add("Viagem ");
        palavras.add("Ferias ");

        System.out.println(palavras);

        palavras.forEach(s -> System.out.println(palavras));


    }
}
