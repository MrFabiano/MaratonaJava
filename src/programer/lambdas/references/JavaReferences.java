package programer.lambdas.references;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/*
Podem ser consideradas simplificaçoes das expressoes lambdas
 */
public class JavaReferences {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        System.out.println(palavras);
        palavras.add("Mercado ");
        palavras.add("Shopping ");
        palavras.add("Carro ");
        palavras.add("Computador ");
        palavras.add("Viagem ");
        palavras.add("Ferias ");

        //Usando lambda
        palavras.sort(Comparator.comparing(s -> s.length()));

        //Method references
        palavras.sort(Comparator.comparing(String::length));

        //Method references Forma 2
        Function<String, Integer> tamanho = s -> s.length();  //Usando lambda
        Comparator<String> comparator = Comparator.comparing(tamanho);
        Comparator<String> comparator1 = Comparator.comparing(String::length);
        palavras.sort(comparator);
        palavras.sort(comparator1);

        palavras.forEach(System.out::println);
    }
}
