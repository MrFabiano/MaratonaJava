package programer.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrincipalStreams04 {

    public static void main(String[] args) {


        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Java","123456", "Programacao", 100));
        cursos.add(new Curso("SpringBoot","1234", "Desenvolvimento", 5));
        cursos.add(new Curso("JavaWeb","12345678", "Desenvolvimento Web", 130));
        cursos.add(new Curso("SprinbootAngular","1245", "Back e Front", 189));
        cursos.add(new Curso("SpringRest","123456098", "Api-Rest", 10));

//        List<Curso> resultado = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .collect(Collectors.toList());
//
//        resultado.forEach(System.out::println);
        //System.out.println(resultado);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos "));
    }
}
