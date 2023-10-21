package collection.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(8);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("----------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 4;
        numerosArray[2] = 6;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("---------------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);


    }
}
