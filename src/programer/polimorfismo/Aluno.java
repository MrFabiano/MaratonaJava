package programer.polimorfismo;
/*
Beneficio da herança
evita a repetição de codigo, facilita a manutenção do programa
 */
public class Aluno extends Pessoa{
    private String ra;

    public Aluno(String nome, int anoNascimento, String email, String ra) {
        super(nome, anoNascimento, email);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public void outraMensagem(String texto) {
        System.out.println(texto);
    }

    public String toString(){
        return super.toString() + "\nR.A:" + this.ra;
    }
}
