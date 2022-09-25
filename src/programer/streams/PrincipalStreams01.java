package programer.streams;

import java.util.ArrayList;
import java.util.List;

public class PrincipalStreams01 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Java","123456", "Programacao", 100));
        cursos.add(new Curso("SpringBoot","1234", "Desenvolvimento", 5));
        cursos.add(new Curso("JavaWeb","12345678", "Desenvolvimento Web", 130));
        cursos.add(new Curso("SprinbootAngular","1245", "Back e Front", 189));
        cursos.add(new Curso("SpringRest","123456098", "Api-Rest", 10));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100) //pegando alunos maior 1ue 100
                .map(Curso::getAlunos)//mapeia um tipo de dado para outro
                .forEach(System.out::println);
    }
}
