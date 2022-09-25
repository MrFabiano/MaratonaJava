package programer.estruturadados.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class JavaLInkedList {

    public static void main(String[] args) {

        List<String> lista = new LinkedList<String>();

        System.out.println(lista.size());

        lista.add("Maria");
        lista.add("Pedro");

        lista.add(0, "Joana");

        System.out.println(lista);


    }
}
