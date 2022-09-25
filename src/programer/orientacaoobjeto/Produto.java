package programer.orientacaoobjeto;

public class Produto {

    String nome;
    float preco;
    float desconto;

    //Metodo para aumentar o preco
    void aumentarPreco(float valor){
        this.preco = this.preco + valor;
    }
}
