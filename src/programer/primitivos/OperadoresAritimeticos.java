package programer.primitivos;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        // + - / *
        // = + soma
        // = - menos
        // = / divisao
        // = * vezes

        // = % resto
        int resto = 20 % 2;
        System.out.println(resto);

        //Operadores Logicos <> <= >=  ==  != vao sempre retornar um valor booleano

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMaiorOuIgual = 10 >= 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDiferente = 10 != 20;
        System.out.println(isDezMaiorQueVinte);


        //&& (AND) || (OR) !
        int idade = 29;
        float salario = 3500F;

        boolean isForaDaLei = idade >= 30 && salario >= 4000;
        boolean isDentroDaLei = idade < 30 && salario > 3.800;
        System.out.println(isForaDaLei);
        System.out.println(isDentroDaLei);

        double valorTotalContaCorrente = 200.0;
        double valotTotalContaPoupanca = 10000;
        double valorPlaystation = 5000;

        boolean isValorPlaystation = valorTotalContaCorrente > valorPlaystation || valotTotalContaPoupanca > valorPlaystation;
        System.out.println("Valor do Playstation: " + isValorPlaystation);

        // = += -= *= /= %=
        double bonus = 2000;
        bonus += 1000; //adiciona 1000 de bonus
        System.out.println("Bonus: " + bonus);


    }
}
