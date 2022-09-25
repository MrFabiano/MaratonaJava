package programer.primitivos;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        System.out.println("Sua idade é: " + idade);


        ////////////////


        //tipos primarios/primitivos
        //POr padrão os numeros reai em Java sao considerados double
        float preco = 34.4f;
        double preco1 = 23.5;

        //tipos não primarios/primitivos
        Float preco2 = 44.5f;
        Double preco3 = 33.5;
        System.out.println("float ->  preco " + preco);
        System.out.println("double ->  preco1 " + preco1);
        System.out.println("Float ->  preco2 " + preco);
        System.out.println("Duble ->  preco3 " + preco);


    }
}
