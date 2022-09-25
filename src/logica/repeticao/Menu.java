package logica.repeticao;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        while(opcao != 3){
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salario");
            System.out.println("3. sair");
            opcao = scanner.nextInt();
        }

        System.out.println("Programa finalizado");
    }
}
