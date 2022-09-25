package logica.repeticao;

/*
Elaborar um programa que calcule a apresente a tabuada de um numero qualquer
 */
public class Tabuada {
    public static void main(String[] args) {
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(5 + " x "  + i + " = " + (5*i));
//
//        }
//    }

        /*
        for aninhado de tabuada
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada 1 a 10 " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

        }
    }
}


