package programer.collections;

import programer.orientacaoobjeto.modificadoresacesso.Cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
Collections coleções
-Java possui diversos classes/interfaces que facilitam muito o trabalho quando se trata de coleções

LIstas
-Aceitam repetiçao de valaores
-possuem tamanho infinito dependendo do tamanho da memoria
- podemos adicionar valores de qualquer tipo desde que nao especificamos um tipo de declaração
 */
public class JavaCollections {

    public static void main(String[] args) {
//        ArrayList<String> nomes = new ArrayList<String>();  //Definido como String
//
//        nomes.add("Joao");
//        nomes.add("maria");
//        nomes.add("priscila");
//        nomes.add("patricia");
//
//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println(nomes.get(i));
//        }
//
//        for (String nome : nomes) {
//            System.out.println(nome);
//        }
//
//        Collections.sort(nomes);  //Ordena a lista
//
//    }
//
//        ArrayList<Integer> numeros = new ArrayList<Integer>();
//
//        numeros.add(42);
//        numeros.add(90);
//        numeros.add(87);
//        numeros.add(30);
//        numeros.add(47);
//
//        Collections.sort(numeros);
//
//        for (int i = 0; i < numeros.size(); i++){
//            System.out.println(numeros.get(i));
//        }

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente clint = new Cliente(18,"Angela", "Rua das acassaisas");
        Cliente client1 = new Cliente(23,"Julia", "Rua centro");

        clientes.add(client1);
        clientes.add(clint);

        for(Cliente cliente : clientes){
            System.out.println(cliente);
        }
    }
}
