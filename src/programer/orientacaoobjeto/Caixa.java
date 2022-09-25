package programer.orientacaoobjeto;

import programer.orientacaoobjeto.modificadoresacesso.encapsulamento.Conta;

public class Caixa {

    private Object[] objetos;
    private int posicaoLivre;

    public Caixa(){
        objetos = new Object[100];
        posicaoLivre = 0;
    }

    public void adicionar(Conta nova){
        this.objetos[this.posicaoLivre] = nova;
        this.posicaoLivre++;
    }

    public Object pegar(int posicao){
        return this.objetos[posicao];
    }
}
