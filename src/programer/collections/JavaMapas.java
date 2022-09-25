package programer.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Mapas - Map
Mapas sao representados pela interface Map
 */
public class JavaMapas {

    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<Integer, String>();

        pessoas.put(23, "Perla");
        pessoas.put(26, "Carla");
        pessoas.put(43, "Maria");

        //Coleçao de chaves
        System.out.println("CHaves: " + pessoas.keySet());

        //Coleção de valores
        System.out.println("Valores: " + pessoas.values());


        //Coleção de associações
        System.out.println("Assosiações: " + pessoas.entrySet());

        //Lambda
        pessoas.keySet()
                .forEach(idade -> System.out.println(pessoas.get(idade)));

        //Iterar ma coleção chaves
        Set<Integer> chaves = pessoas.keySet();
        for (Integer idade : chaves) {
            System.out.println(idade);
//                }
//
            for (Integer idad : chaves) {
                System.out.println(pessoas.get(idad));
//        }

                //Iterar na coleçoa de valores
                //Forma 1
                Collection<String> valores = pessoas.values();
                for (String valor : valores) {
                    System.out.println(valor);
//        }
//
//        //Forma 2, lambda
                    pessoas.values().forEach(valore -> System.out.println(valore));
//
//    }
//
                    //Iterar a coleção de associaçao
                    Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();
                    for (Map.Entry<Integer, String> associacao : associacoes) {
                        System.out.println(associacao.getKey() + " - " + associacao.getValue());
                    }

                    //forma2
                    pessoas.entrySet().forEach(associacao -> System.out.println(associacao.getKey()
                            + " - " + associacao.getValue()));
                }
            }
        }
    }
}
