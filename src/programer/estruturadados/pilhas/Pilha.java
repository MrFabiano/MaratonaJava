package programer.estruturadados.pilhas;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    /*
    Em uma pilha sempre inserimos elementos no topo
     */
    private List<String> nomes = new LinkedList<String>();

    public void insere(String nome){
       this.nomes.add(nome);
    }

    public String remove(){
        return nomes.remove(nomes.size() -1);
    }

    public boolean vazia(){
        return nomes.size() == 0;
     }

     public String pegaTopo(){
        return nomes.get(nomes.size() - 1);
     }


    @Override
    public String toString() {
        return  this.nomes.toString();
    }
}
