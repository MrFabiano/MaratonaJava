package programer.estruturadados;

import programer.estruturadados.linkedlist.ListaLigada;

public class ListaDuplamenteLigada {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.adiciona("angelina");
        System.out.println(lista);
        lista.adiciona("maria");
        System.out.println(lista);

       lista.remove(0);
       System.out.println(lista);

        System.out.println(lista.contem("angelina"));
    }
}
