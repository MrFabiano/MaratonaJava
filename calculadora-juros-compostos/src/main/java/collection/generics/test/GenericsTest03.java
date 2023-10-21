package collection.generics.test;

import collection.generics.Barco;
import collection.generics.Carro;
import collection.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest03 {

    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>
                (List.of(new Carro("BMW"),
                        new Carro("Mercedez")));

        List<Barco> barcosDisponiveis = new ArrayList<>
                (List.of(new Barco("Lancha"),
                        new Barco("Barco")));

        RentalService<Carro> carroRentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = carroRentalService.retrieveAvailableCar();
        System.out.println("Usando o carro por um mês");
        System.out.println(carro);

        System.out.println("-------------------");

        RentalService<Barco> barcoRentalService = new RentalService<>(barcosDisponiveis);
        Barco barco = barcoRentalService.retrieveAvailableCar();
        System.out.println("Usando o barco por um mês");
        System.out.println(barco);

    }
}
