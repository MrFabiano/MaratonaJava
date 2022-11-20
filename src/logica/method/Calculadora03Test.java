package logica.method;

public class Calculadora03Test {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividiDoiNumeros(25, 5);
        System.out.println(result);
        System.out.println("--------------");
        calculadora.imprimeDoisValores(58, 4);
    }
}
