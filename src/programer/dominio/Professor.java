package programer.dominio;

public class Professor {

    public String nome = "Fabiano";
    public int idade = 38;
    public char sexo = 'M';

    public static void main(String[] args) {
         Professor professor = new Professor();
        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}


