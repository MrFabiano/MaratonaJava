package programer.dominio.associacao;

public class Aluno {

    private String nome;
    private String idade;
    private Seminario seminario;

    public Aluno(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, String idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
