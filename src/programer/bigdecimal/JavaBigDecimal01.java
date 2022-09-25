package programer.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaBigDecimal01 {

    public static void main(String[] args) {

        //Casas decimais e arredondamento
        BigDecimal valor = new BigDecimal("0.2")
                .setScale(4, RoundingMode.CEILING);
        System.out.println(valor);
        System.out.println("----------------");


        BigDecimal valor1 = new BigDecimal("0.2")
                .setScale(4, RoundingMode.HALF_EVEN);
        System.out.println(valor1);
    }
}
