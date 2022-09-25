package programer.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/*
Os conjuntos sao implementados com a interface Set, é uma das classes que implementam esta interface é a HashSet
- nao aceita hordenação
- nao possui indice
-nao aceita valores repetidos
- a ordem de inserção não é respeitada
 */
public class Conjuntos {

    public static void main(String[] args) {
//
//        Set<String> nomes = new HashSet<String>();
//
//        nomes.add("Maria");
//        nomes.add("Joana");
//        nomes.add("Zuleika");
//        nomes.add("Carla");

        System.out.println("-----------");
//        Set<String> nomess =  nomes.stream()
//                .distinct()
//                .collect(Collectors.toList())
//                        .forEach(System.out::println("nomes"));

        //System.out.println(nomes.contains("Joana"));

//
//        System.out.println("-----------");
//
//        System.out.println(nomes.size());
//
//        for(int i = 0; nomes.isEmpty(); i++){
//            System.out.println(i);
//        }
//        System.out.println("-----------");
//         for(String nome : nomes){
//             System.out.println(nome);
//         }
        Set<String> nomes = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        boolean res;

        for(int i = 0; i < 5; i++){
            System.out.println("Informe o nome " + (i + 1) + " /5 nome: ");
            String nome = scanner.nextLine();
            res = nomes.add(nome);
            if(!res){
                System.out.println("O nome não pode ser repetido");
                i--;
            }
        }

        System.out.println("No conjunto de nomes temos: " + nomes.size() + "elementos");

        for(String nome : nomes){
            System.out.println(nome);
        }

        scanner.close();
    }
}
