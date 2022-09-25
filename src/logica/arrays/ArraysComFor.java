package logica.arrays;

import java.util.Scanner;

public class ArraysComFor {

    public static void main(String[] args) {
//        double[] notas = new double[4];
//        double media = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Digite a nota " + (i + 1));
//            notas[i] = scanner.nextDouble();
//            media = media + notas[i];
//        }
//        System.out.println("Media das notas : " + media/notas.length);
//
//    }
//}
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a note %d: ", (i + 1));
            notas[i] = scanner.nextDouble();
            soma = soma + notas[i];
        }

        System.out.printf("A media do aluno foi %.2f", soma / notas.length);
    }
}



