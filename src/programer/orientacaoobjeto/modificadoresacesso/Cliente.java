package programer.orientacaoobjeto.modificadoresacesso;

public class Cliente implements Comparable{
    //Protected = protegido
    //visivel somente no mesmo pacote.
    private int idade;
    String nome;
    String endereco;

    public Cliente(int idade, String nome, String endereco) {
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return
                this.nome = nome;

    }

    @Override
    public int compareTo(Object cliente) {
        Cliente aux = (Cliente) cliente;
        if(this.idade < aux.idade){
            return -1;
        } else if(this.idade > aux.idade){
            return 1;
        } else {
            return 0;
        }
    }
}
