package programer.orientacaoobjeto.sobescrita;


public class Anime extends Object{

    private String nome;


    @Override
    public String toString() {
        return "Anime " +
                "nome = '" + nome + '\''
                ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
