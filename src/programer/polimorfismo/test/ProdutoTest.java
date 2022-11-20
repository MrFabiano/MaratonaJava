package programer.polimorfismo.test;

import programer.polimorfismo.Computador;
import programer.polimorfismo.Tomate;
import programer.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {

    public static void main(String[] args) {
        Computador computador = new Computador("Processador M2 ", 160000);
        Tomate tomate = new Tomate("tomate siciliano", 10);

        CalculadoraImposto.calcularImpostoProduto(computador);
        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("----------------------------");

    }
}
