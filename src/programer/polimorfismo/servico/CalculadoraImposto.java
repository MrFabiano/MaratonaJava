package programer.polimorfismo.servico;

import programer.polimorfismo.Produto;
import programer.polimorfismo.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoProduto(Produto produto) {

        System.out.println("Relatorio de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Valor " + produto.getValor());
        System.out.println("Produto " + produto.getNome());
        System.out.println("Imposto a ser pago " + imposto);
        System.out.println("-------------------------------");
        if (produto instanceof Tomate) {   //instanceof para verificar se o tomate é um produto
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
