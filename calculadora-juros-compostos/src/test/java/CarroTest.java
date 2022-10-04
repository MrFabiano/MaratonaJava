import calculadora.domain.orientacaoobjeto.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "sport";
        carro1.ano = 2000;
        carro1.nome = "Mustang";

        carro2.modelo = "120I";
        carro2.ano = 2016;
        carro2.nome = "BMW";

        System.out.println("\nCarro1");
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println(carro1.nome);

        System.out.println("\nCarro2");
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
        System.out.println(carro2.nome);

    }
}
