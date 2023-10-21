package collection.generics.service;

import collection.generics.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentalService {

    private final List<Barco> barcosDisponiveis = new ArrayList<>
            (List.of(new Barco("Lancha"),
            new Barco("Barco")));


    public Barco retrieveAvailableCar(){
        System.out.println("Buscando barco disponivel");
        Barco barco =  barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " +barco);
        System.out.println("Barco disponiveis para alugar");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarCarroAlugado(Barco barco){
        System.out.println("Devolvendo barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barco disponiveis para alugar");
        System.out.println(barcosDisponiveis);
    }
}
