package logica.modificadorfinal;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_MAXIMA);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("goku");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("F1");
        ferrari.imprime();
    }
}
