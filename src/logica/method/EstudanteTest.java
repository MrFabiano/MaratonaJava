package logica.method;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante.nome = "minutario";
        estudante.idade = 15;
        estudante.sexo = 'M';

        estudante1.nome = "minutouto";
        estudante1.idade = 18;
        estudante1.sexo = 'F';

        imprimeEstudante.ImprimeEstudante(estudante);
        imprimeEstudante.ImprimeEstudante(estudante1);

    }

}


