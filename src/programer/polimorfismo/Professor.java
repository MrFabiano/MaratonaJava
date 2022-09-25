package programer.polimorfismo;

public class Professor extends Pessoa{

    private String matricula;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Professor(String nome, int anoNascimento, String email, String matricula) {
        super(nome, anoNascimento, email);
        this.matricula = matricula;
    }

    @Override
    public void outraMensagem(String texto) {
        System.out.println(texto);
    }

    public String toString(){
        return super.toString() + "\nMatricula: " + this.matricula;
    }
}
