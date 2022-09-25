package logica.repeticao;

import java.util.Scanner;
/*
Criar um sistema de login, e digitar os dados corretos e exibir mensagem, caso contrario tem que digitar novamente,
ate acertar o login e senha.
 */

public class Login {

    public static void main(String[] args) {
        final String login = "login";
        final String password = "password";
        boolean usuarioAutenticado = true;
        Scanner scanner = new Scanner(System.in);
        while(usuarioAutenticado){
            System.out.println("Digite seu login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite seu password");
            String passwordDigitado = scanner.nextLine();
            if(loginDigitado.equals(loginDigitado) && passwordDigitado.equals(passwordDigitado)){
                System.out.println("Acesso concedido");
                usuarioAutenticado = false;
                break;
            }

            }

            System.out.println("Programa terminado");
        }
    }

