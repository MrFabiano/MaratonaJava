package programer.dominio;

public class Carro {
    public String nome;
    public String  modelo;
    public String data;

    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro1.modelo = "120I";
        carro1.nome = "BMW";
        carro1.data = "20/01/2016";

        carro.modelo = "A3";
        carro.nome = "Audi";
        carro.data = "15/01/2012";


        System.out.println(carro1.modelo);
        System.out.println(carro1.nome);
        System.out.println(carro1.data);

        System.out.println("----------------");

        System.out.println(carro.modelo);
        System.out.println(carro.nome);
        System.out.println(carro.data);
    }
}
