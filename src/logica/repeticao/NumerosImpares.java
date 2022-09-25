package logica.repeticao;

import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor desejado");

        int valorFinal = scanner.nextInt();
        int i = 0;
        while(i <= valorFinal){
            if(i % 2 != 0){
                System.out.println(" i " + i);
            }
             i = i + 1;
        }

    }
}
