package collection.generics.test;

import collection.generics.Barco;
import collection.generics.service.BarcoRentalService;
import collection.generics.service.CarroRentalService;

public class GenericsBarcoTest {

    public static void main(String[] args) {

        BarcoRentalService barcoRentalService = new BarcoRentalService();

        Barco barco = barcoRentalService.retrieveAvailableCar();
        System.out.println("Usando o barco por um mẽs");
        barcoRentalService.retornarCarroAlugado(barco);
    }
}
