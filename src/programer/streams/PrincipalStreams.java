package programer.streams;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

/*
Streams = são fluxos de dados/objetos utilizados para que possamos trabalhar com esses dados de forma mais criteriosa

quando trabalhamos com streams, os metodos aplicados a este streams não afeta a coleçao original
 */
public class PrincipalStreams {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Java","123456", "Programacao", 100));
        cursos.add(new Curso("SpringBoot","1234", "Desenvolvimento", 5));
        cursos.add(new Curso("JavaWeb","12345678", "Desenvolvimento Web", 130));
        cursos.add(new Curso("SprinbootAngular","1245", "Back e Front", 189));
        cursos.add(new Curso("SpringRest","123456098", "Api-Rest", 10));

        //Como fer para imprimir uma materia com mais de 100 alunos
        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getAlunos()));

        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(System.out::println);
    }
}
