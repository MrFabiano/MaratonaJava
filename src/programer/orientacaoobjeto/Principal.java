package programer.orientacaoobjeto;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "Caneta";
        produto.preco = 5.98f;
        produto.desconto = 1.0f;

        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3.588f;
        produto1.desconto = 2.5f;

        System.out.println("==========Produto===========");
        System.out.println("Nome: " + produto.nome);
        System.out.println("R$: " + produto.preco);
        System.out.println("Desconto: " + produto.desconto + " % ");

        System.out.println("=============================");

        Pessoa pessoa2 = new Pessoa("Conceição", 1954, "conceicaodossantos@hotmail.com");
        pessoa2.imprimeInformacoes();
        System.out.println("=============================");

        Pessoa pessoa = new Pessoa("Fabiano Teixeira", 1983, "fabianodossantos@agilethought.com");
        pessoa.imprimeInformacoes();

        System.out.println("=============Pessoa===========");


    }
}
