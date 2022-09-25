package logica.programacao;

import java.util.Scanner;

public class TorneioNatacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        if(idade <= 10){
            System.out.println(" Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(" Juvenil");

        } else if (idade >= 16 && idade <= 19) {
            System.out.println(" Pre-adulto");

        }else {
            System.out.println(nome + " Adulto");
        }

    }
}
