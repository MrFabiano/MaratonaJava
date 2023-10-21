package collection.generics.test;

import collection.generics.Carro;
import collection.generics.service.CarroRentalService;

public class GenericsTest {

    public static void main(String[] args) {

        CarroRentalService carroRentalService = new CarroRentalService();

        Carro carro = carroRentalService.retrieveAvailableCar();
        System.out.println("Usando o carro por um mẽs");
        carroRentalService.retornarCarroAlugado(carro);
    }
}
