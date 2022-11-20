package logica.method;

public class Calculadora04Test {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 9;
        int b = 10;
        calculadora.alteraDoisNUmeros(a, b);
        System.out.println("Calculando numeros");
        System.out.println("NUm1 " + a);
        System.out.println("NUm2 " + b);

    }
}
