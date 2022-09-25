package programer.estruturadados.conjuntos;

import java.util.LinkedList;

/*
Umas das caracteristicas dos conjuntos e a aceitação de elementos repetidos
 */
public class Conjuntos {

    public static void main(String[] args) {

//        LinkedList<String> conjuntos = new LinkedList<String>();
//
//        if(!conjuntos.contains("Angelina")){
//            conjuntos.add("Angelina");
//
//        }
//        if(!conjuntos.contains("Felicity")){
//            conjuntos.add("Felicity");
//
//         }
//        if(!conjuntos.contains("Angelina")) {
//            conjuntos.add("Angelina");
//        }
//        System.out.println(conjuntos);

//        for(int i = 97; i < 123; i++){
//            System.out.println((char)i); //cast
//        }
//    }
//
//        String nome = "Angelina";
//        System.out.println(nome.toLowerCase().charAt(0) % 26);

        // 8/ 2 = 4
        // 4/2 = 2
        // 2/2 = 0
//        System.out.println(8 % 2); //me de o resto da divisao de 8 por 2

        Conjunto conjunto = new Conjunto();

        System.out.println(conjunto);

        conjunto.adiciona("Angelina");
        System.out.println(conjunto);
        System.out.println(conjunto);

        conjunto.adiciona("Ana");
        System.out.println(conjunto);

        conjunto.adiciona("Felicity");
        conjunto.adiciona("Gabriela");
        conjunto.adiciona("Julia");

        conjunto.remove("Julia");

        System.out.println(conjunto);


    }
}