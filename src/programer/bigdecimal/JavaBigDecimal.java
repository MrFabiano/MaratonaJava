package programer.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaBigDecimal {

    public static void main(String[] args) {
        //Errado declarar bigdecimal com construtor
        BigDecimal valor = new BigDecimal(10);
        System.out.println("------------------------");

        //Correto declar bigdecimal tanto com string como usando "valueOf"
        BigDecimal bigDecimal = new BigDecimal("10");
        BigDecimal bigDecimal1 = BigDecimal.valueOf(0.2);
        System.out.println("------------------------");


        System.out.println("-----------BigDecimal-------------");

        BigDecimal valor1 = new BigDecimal(10);
        BigDecimal valor2 = new BigDecimal(20);
        BigDecimal resultado;
        System.out.println("------------------------");


        //Adicao
        resultado = valor1.add(valor2);
        System.out.println(resultado.toPlainString());
        System.out.println("------------------------");

        //SUBTRAÇAO
        resultado = valor1.subtract(valor2);
        System.out.println(resultado.toPlainString());
        System.out.println("------------------------");

        //MULTIPLICACAO
        resultado = valor1.multiply(valor2);
        System.out.println(resultado.toPlainString());
        System.out.println("------------------------");

        //DIVISAO
        resultado = valor1.divide(valor2, RoundingMode.HALF_EVEN);
        System.out.println(resultado.toPlainString());
        System.out.println("------------------------");





    }
}
