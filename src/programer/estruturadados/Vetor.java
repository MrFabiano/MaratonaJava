package programer.estruturadados;

import java.util.Arrays;

public class Vetor {

    private Aluno alunos[] = new Aluno[100];
    private int total = 0;

    public void adiciona(Aluno aluno){
        //recebe um aluno
//        for(int i = 0; i < alunos.length; i++){
//            if(alunos[i] == null){
//                alunos[i] = aluno;
//                break;
//            }
//        }
        this.alunos[total] = aluno;
        total = total + 1;

    }

    public void adiciona(int posicao, Aluno aluno){
        this.garantirEspaco();
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posiçao invalida");
        }
        for(int i = total -1; i <= posicao; i -=1){
            alunos[i+1] = alunos[i];
        }

        alunos[posicao] = aluno;
        total++;
    }

    public Aluno pega(int posicao){
        // recebe uma posição e devolve o aluno
        this.garantirEspaco();
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição invalida");
        }
        return this.alunos[posicao];
    }

    public void remove(int posicao){
        //remove aluno pela posição
        for(int i = posicao; i < this.total; i++){
            this.alunos[i] = this.alunos[i+1];
        }
        total--;
    }

    public  boolean contem(Aluno aluno){
        //descobre se o aluno esta ou na lista
        for(int i = 0; i < total; i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }

        return false;
    }

    public int tamanho(){
        //devolve a quantidade de alunos no vetor
        return this.total;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos);
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < total;
    }

    private void garantirEspaco(){
        if(total == alunos.length){
            Aluno novoArray[] = new Aluno[alunos.length*2];
            for(int i = 0; i < alunos.length; i++){
                novoArray[i] = alunos[i];
            }

            this.alunos = novoArray;
        }
    }
}
