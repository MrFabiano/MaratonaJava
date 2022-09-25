package programer.estruturadados.filas;

import java.util.LinkedList;
import java.util.Queue;

public class FilaJava {

    public static void main(String[] args) {

        //Queue = trabalhar com filas
        Queue<String> filas = new LinkedList<String>();

        System.out.println(filas);
        filas.add("Angelina");
        filas.add("Maria");
        filas.add("Felicity");
        System.out.println(filas);

        String ret = filas.poll();
        System.out.println(ret);

        System.out.println(filas);



    }
}

