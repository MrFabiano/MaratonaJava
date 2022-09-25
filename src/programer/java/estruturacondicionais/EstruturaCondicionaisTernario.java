package programer.java.estruturacondicionais;

public class EstruturaCondicionaisTernario {

    public static void main(String[] args) {
        //Doar salario > 5000
        double salario = 3000;
        String mensagemDoar = "Vou contribuir para a doação";
        String mensagemNaoDoar = "No momento não consigo fazer uma doação";

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}




