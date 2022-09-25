package programer.streams;

public class Curso {

    private String nome;
    private String materia;
    private String matricula;
    private int alunos;


    public Curso(String nome, String materia, String matricula, int alunos) {
        this.nome = nome;
        this.materia = materia;
        this.matricula = matricula;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return this.nome;

    }
}
