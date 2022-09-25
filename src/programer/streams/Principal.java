package programer.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Classes anonimas, lambda,references,
 */
public class Principal {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Java","123456", "Programacao", 100));
        cursos.add(new Curso("SpringBoot","1234", "Desenvolvimento", 5));
        cursos.add(new Curso("JavaWeb","12345678", "Desenvolvimento Web", 130));
        cursos.add(new Curso("SprinbootAngular","1245", "Back e Front", 189));
        cursos.add(new Curso("SpringRest","123456098", "Api-Rest", 10));

        //System.out.println(cursos);

        cursos.sort(Comparator.comparing(c -> c.getMateria())); //lambda
        cursos.sort(Comparator.comparing(Curso::getMateria)); //References

        cursos.forEach(c -> System.out.println(c.getMateria())); //lambda
        cursos.forEach(System.out::println); //refences



    }
}
