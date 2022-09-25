package programer.orientacaoobjeto;

public class Pessoa {

    String nome;
    int dataNascimento;
    String email;

    //Construtor vazio
    public Pessoa(){

    }

    //Construtor com parametros
    public Pessoa(String nome, int dataNascimento, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    //Metodo que imprime as informações
    public void imprimeInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail : " + this.email);
        System.out.println("Data de nascimento : " + this.dataNascimento);
    }
}
