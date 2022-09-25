package logica.programacao;

import java.util.Scanner;

public class CadastroLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        if(nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("Usuario inválido");
        }else{
            System.out.println(nome + "cadastro com sucesso");
        }
    }
}
