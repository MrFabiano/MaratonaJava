package programer.dominio;

public class Professor {

    public String nome = "Fabiano";
    public int idade = 38;
    public char sexo = 'M';
    private String especialidade;

    public Professor(String nome, int idade, char sexo, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}


