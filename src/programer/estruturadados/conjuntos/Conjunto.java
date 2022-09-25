package programer.estruturadados.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {

    private ArrayList<LinkedList<String>> tabelas = new ArrayList<LinkedList<String>>();

    public  Conjunto(){
        for(int i = 0; i < 26; i++){
            tabelas.add(new LinkedList<String>());
        }
    }

    private int calculaIndice(String nome){
        return nome.toLowerCase().charAt(0) % 26;
    }

    public void adiciona(String nome){
        //verifica se  o nome nao existe na lista
        if(!contem((nome))){
            //calculando indice do nome
            int indice = calculaIndice(nome);
            //pegando a lista de acorod com o indice
            List<String> listas = tabelas.get(indice);
            //adicona o nome na lista
            listas.add(nome);
        }

    }

    private boolean contem(String nome){
        //calculando o indice do nome
        int indice = calculaIndice(nome);
        // buscando na tabela especific o indice do nome
        return tabelas.get(indice).contains(nome);
    }

    public void remove(String nome){
        //verifica se o nome ext
        if (contem(nome)) {
            //calculamos o indice do nome
            int indice = calculaIndice(nome);
            //pegando a lista especifica
            List<String> listas = tabelas.get(indice);
            listas.remove(nome);
        }
    }


    @Override
    public String toString() {
        return tabelas.toString();
    }
}
