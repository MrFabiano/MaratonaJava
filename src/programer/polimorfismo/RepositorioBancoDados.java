package programer.polimorfismo;

import programer.polimorfismo.servico.Repositorio;

public class RepositorioBancoDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
