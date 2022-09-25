package programer.dominio.metodos;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);

    }

    public void subtraiDoisNumeros(){
        System.out.println(10 - 2);
    }

    //Passando parametro
    public void multiplicacaoDoiNumeros(int num, int num2){
        System.out.println(num * num2);
    }

    //Retorno
    public double divideDoisNumeros(double num, double num2){
        return num / num2;
    }

    //Retorno
    public double divideDoisNumeros02(double num, double num2){
        if(num2 != 0){
            return 0;
        }
        return num / num2;
    }

    public void imprimeDoisValoresDivididos(double num, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisao por zero");
            return;
        }

        System.out.println(num / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNUmeros");
        System.out.println("Num1: " + numero1);
        System.out.println("Num2: " + numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma =+ num;
        }

        System.out.println(soma);
    }

    public void somaVarargs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }

        System.out.println(soma);
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[]numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarargs(1,2,3,4,5);
        System.out.println("====================");

        calculadora.somaDoisNumeros();
        System.out.println("-----------");

        calculadora.subtraiDoisNumeros();
        System.out.println("-----------");

        calculadora.multiplicacaoDoiNumeros(10, 10);
        System.out.println("-----------");

        double result = calculadora.divideDoisNumeros(25,5);
        System.out.println(result);
        System.out.println("-----------");

        double divide = calculadora.divideDoisNumeros02(80, 4);
        System.out.println(divide);
        System.out.println("-----------");

        calculadora.imprimeDoisValoresDivididos(100, 25);
        System.out.println("----------------------------------");

    }
}
