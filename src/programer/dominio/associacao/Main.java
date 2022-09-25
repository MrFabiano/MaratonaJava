package programer.dominio.associacao;

public class Main {

    public static void main(String[] args) {
        Local local = new Local("Centro: ");
        Aluno aluno = new Aluno("JOAO ", "14");
        Professor professor = new Professor("Julii ", "transito ");

        Aluno[] alunosSeminarios = {aluno};
        Seminario seminario = new Seminario("Transienty ", alunosSeminarios, local);

        Seminario[] seminarioDisponiveis = {seminario};
        professor.setSeminarios(seminarioDisponiveis);


        professor.imprime();
    }
}
