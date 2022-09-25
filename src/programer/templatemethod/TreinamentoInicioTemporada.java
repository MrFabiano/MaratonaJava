package programer.templatemethod;

public class TreinamentoInicioTemporada extends Treinamento{

    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico de inicio da temporada");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo Treino inicio de temporada");
    }
}
