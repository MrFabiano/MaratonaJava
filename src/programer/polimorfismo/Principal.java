package programer.polimorfismo;

public class Principal {

    public static void main(String[] args) {

       // Pessoa p1 = new Pessoa("Fabiano", 1983, "fabiano@cloud");

//        System.out.println("Pessoa: " + p1.getNome());
       // System.out.println(p1);
        System.out.println("-------------");

        Aluno aluno = new Aluno("Paula", 2001, "12345", "paula@cloud.com");

//        System.out.println("Aluno: " + aluno.getNome());
        System.out.println(aluno);
        System.out.println("-------------");

        Professor prof = new Professor("Pedro", 1976, "eter", "pedro@cloud.com");

//        System.out.println("Professor: " + prof.getNome());
        System.out.println(prof);
        System.out.println("-------------");

    }
}
