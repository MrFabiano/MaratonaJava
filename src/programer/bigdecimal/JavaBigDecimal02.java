package programer.bigdecimal;

import java.math.BigDecimal;

public class JavaBigDecimal02 {

    public static void main(String[] args) {

        BigDecimal valor = new BigDecimal(10);
        BigDecimal valor1 = new BigDecimal(10);

        //converte para int
        int i = valor.intValue();

        //converte para long
        long l = valor.longValue();

        //converte para double
        double d = valor.doubleValue();

        //converte para float
        float f = valor.floatValue();

        //converte para String
        String s = valor.toPlainString();

        //Nunca usar o "equals" para comparar o BigDecimal
        //verifica se o valor 1 é menor que o valor 2
        if (valor.compareTo(valor1) < 0) {
            System.out.println("Valor 1 e maior que valor 2");
        }

        //verifica se o valor 1 é igual ao valor 2
        if (valor.compareTo(valor1) == 0) {
            System.out.println("Valor 1 e maior que valor 2");
        }

        //verifica se o valor 1 é diferente do valor 2
        if (valor.compareTo(valor1) != 0) {
            System.out.println("Valor 1 e maior que valor 2");
        }

        //verifica  se o vaor 1 é maior que o valor 2
        if (valor.compareTo(valor1) > 0) {
            System.out.println("Valor 1 e maior que valor 2");
        }
    }
}
