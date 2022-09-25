package programer.defaultmethods;

import java.util.Comparator;
/*
Criando um comparador de objetos (String) para que seja possivel desta forma ordenar o seu tamanho.
 */
public class ComparadorPorTamanho implements Comparator<String> {


    @Override
    public int compare(String s1, String s2) {
        // A string 1 é menor que a string 2 -> retornamos -1
        if(s1.length() < s2.length()){
            return -1;
        }
        // A string1 é maior que a string2 => retornamos 1
        if(s1.length() > s2.length()){
            return 1;
        }
        //A string1 tem o mesmo tamanho da string2, retornamos = 0
        return 0;
    }
}
