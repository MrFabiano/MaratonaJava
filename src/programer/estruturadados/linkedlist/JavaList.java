package programer.estruturadados.linkedlist;

/*
Lista Linkedlist =
 */
public class JavaList {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.adiciona("ANGELINA");
        System.out.println(lista);
        lista.adiciona("maria");
        System.out.println(lista);

        lista.removeDoComeco();
        System.out.println(lista);
    }
}
