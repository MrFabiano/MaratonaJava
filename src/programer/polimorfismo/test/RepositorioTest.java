package programer.polimorfismo.test;

import programer.polimorfismo.RepositorioArquivo;
import programer.polimorfismo.RepositorioMemoria;
import programer.polimorfismo.servico.Repositorio;

public class RepositorioTest {

    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
