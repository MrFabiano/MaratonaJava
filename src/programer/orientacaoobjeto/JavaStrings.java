package programer.orientacaoobjeto;

import java.util.Locale;

/*
Strings = sao imutaveis, ou sej nao muda
 */
public class JavaStrings {

    public static void main(String[] args) {
        String curso = "Programaço java essencial";

        //curso = curso.replace("a", "0"); //Altera a string se encontrar a primeira palavra para segunda


       curso = curso.toLowerCase(); //converte de maiscula para minuscula

        curso = curso.toUpperCase();

        System.out.println(curso);

        System.out.println(curso.charAt(12));

        for(int i = 0; i < curso.length(); i++){
            System.out.print(curso.charAt(i));
        }

        for(int i = (curso.length() - 1); i >= 0; i--){  //Inverte a impressao
            System.out.print(curso.charAt(i));
        }
    }
}
