package logica.programacao;

public class CalcularImpostoCondicional {

    public static void main(String[] args) {
        float salario = 4100.50F;
        float resultado = 0F;
        String porcentagem = "";

        if(salario > 4500){
            resultado = salario * 0.3F;
            porcentagem = "30%";
        }else{
            resultado = salario * 0.1f;
            porcentagem = "10%";
        }

        System.out.println("O valor final em porcentagem é " + porcentagem + " é de " + resultado);

    }
}
