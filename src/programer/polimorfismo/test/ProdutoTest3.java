package programer.polimorfismo.test;

import programer.polimorfismo.Computador;
import programer.polimorfismo.Produto;
import programer.polimorfismo.Tomate;
import programer.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest3 {

    public static void main(String[] args) {
        Produto produto = new Computador("Processador M2", 16000);

        Tomate tomate = new Tomate("Tomate", 5.0);
        tomate.setDataValidade("21/11/2022");

        CalculadoraImposto.calcularImpostoProduto(produto);
        CalculadoraImposto.calcularImpostoProduto(tomate);

    }
}
