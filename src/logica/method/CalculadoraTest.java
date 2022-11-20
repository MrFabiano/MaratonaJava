package logica.method;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando calculadora");
        System.out.println("------------");
        System.out.println("Finalizando a subtração");
        calculadora.subtraiDoisNumeros();
    }
}
