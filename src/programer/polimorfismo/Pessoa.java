package programer.polimorfismo;
/*
Agora como classe abstrata

desta forma, impossibiltamos a criação de objetos desta classe

 Uma classe abstrata pode ter:
 - atributos
 -metodos
 -metodos abstratos

 Metodos abstratos
 São metodos que não possuem implementação, possuem apenas declaração e obrigatoriamente, as classes que
 herdam desta classe com metodos abstratos, precisa implementar estes metodos.
 */
public abstract class Pessoa {

    private String nome;
    private int anoNascimento;
    private String email;

    public Pessoa(String nome, int anoNascimento, String email) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    //Declaraçao de um metodo abstrato
    public abstract  void outraMensagem(String texto);

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", email='" + email + '\'' +
                '}';
    }
}

