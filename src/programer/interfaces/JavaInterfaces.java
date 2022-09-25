package programer.interfaces;
/*
Interfaces = são contratos
 */
public class JavaInterfaces {

    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println("A marca do carro é: " + carro.MARCA);

        carro.desligar();

        carro.ligar();

        carro.desligar();
    }
}
