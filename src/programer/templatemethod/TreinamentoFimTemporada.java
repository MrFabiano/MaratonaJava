package programer.templatemethod;

public class TreinamentoFimTemporada extends  Treinamento{

    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico de fim da temporada");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo Treino fim da temporada");
    }
}
