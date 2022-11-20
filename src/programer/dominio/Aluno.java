package programer.dominio;

public class Aluno {

    private String idade;
    private String nome;
    private Seminario seminario;


    public Aluno(String idade, String nome, Seminario seminario) {
        this.idade = idade;
        this.nome = nome;
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
