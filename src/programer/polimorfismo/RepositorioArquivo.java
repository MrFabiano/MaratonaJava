package programer.polimorfismo;

import programer.polimorfismo.servico.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }
}
