package programer.templatemethod;

public class JavaTemplateMethod {

    public static void main (String args[]){

        TreinamentoInicioTemporada trInicioTemporada = new TreinamentoInicioTemporada();

        trInicioTemporada.treinoDiario();

        TreinamentoFimTemporada trFinalTemporada = new TreinamentoFimTemporada();

        trFinalTemporada.treinoDiario();
    }
}
