package logica.programacao;

public class Salario {

    public static void main(String[] args) {
        double salario = 4000.00D;
        double porcentagem = 30D;

        double calcular = salario * (porcentagem / 100);

        System.out.println(calcular);
    }
}
