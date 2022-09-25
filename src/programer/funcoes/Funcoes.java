package programer.funcoes;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Funcoes {

    //Criano a propria função

    /*
    Faça um programa que receba diversos nomes de frutas do usuario e no final imprima essas
    frutas em ordem contraria. O programa deve solicitar ao usuario quantas frutas ele quer informar

    informe quantas frutas deseja cadastras: 2

    informe o nome de um fruta
    Manga

    informa o nome de uma fruta
    goiaba

    Goiaba
    Manga
     */

    //declaraçao do vetor
    //variaveis globais
    static String[] frutas;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //variavel local
        int qtd;
        System.out.println("Informe a quantidade de frutas para cadatrar");
        qtd = Integer.parseInt(scanner.nextLine());

        cadastrar_dados(qtd);
        mostrar_dados(qtd);

        scanner.close();
    }

    /*
     Uma funça deve ter o seguinte
     tipo de retorno ( tipo de dado que a funçao vai retornar)
     nome: corresponde a ação que a função realiz
     parametros/ argumentos de entrada(opcional)
     retorno (opcional) depende do tipo do retorno
     void = vazio
     */
    static void cadastrar_dados(int quantidade){
        //definindo o tamanho do vetor
        frutas = new String[quantidade];

        //3
        //0...2(0,1,2,)
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe a " + (i + 1) + " fruta "); //i++  => i + 1 = soma
            frutas[i] = scanner.nextLine();
        }

    }

    static void mostrar_dados(int quantidade){
        for (int i = (quantidade - 1); i >= 0; i--) {  //i-- => i - 1 = menos
            System.out.println(frutas[i]);

        }

    }
}


