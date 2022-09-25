package programer.templatemethod;
/*
Template Method

Final é um modificador de acesso que faz o elemento que seja utilizando noa possa ser extendido ou reescrito
 */
public abstract class Treinamento {

    //Template Method

    public final void treinoDiario(){
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();

    public abstract void jogoTreino();

    public final void treinoTatico(){
        System.out.println("Treino tatico");
    }
}
