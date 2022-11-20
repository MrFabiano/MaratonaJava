package programer.polimorfismo.test;

import programer.polimorfismo.Computador;
import programer.polimorfismo.Produto;
import programer.polimorfismo.Tomate;

public class ProdutoTest2 {

    public static void main(String[] args) {
        Produto produto = new Computador("Processador M2", 16000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------------");

        Produto produto2 = new Tomate("Tomate", 5.0);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("-----------------------");

    }
}
