package programer.abstrata;

import programer.polimorfismo.Aluno;
import programer.polimorfismo.Pessoa;
/*
Não consegue instanciar obetos de uma classe abstrata
 */
public class ExemploClasseAbstrata {

    public static void main(String args[]){
        Aluno maria = new Aluno("Maria", 1987, "233", "1234");

        System.out.println(maria);

        maria.outraMensagem("Meu nome é: " + maria.getNome());

    }
}
