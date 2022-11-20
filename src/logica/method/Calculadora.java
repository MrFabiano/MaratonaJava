package logica.method;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(20 - 8);
    }

    public void multiplicaNumerosComParametros(int num, int num2) {
        System.out.println(num * num2);
    }

    public double dividiDoiNumeros(double num1, double num2){
        return num1 / num2;
    }

    public void imprimeDoisValores(double num1, double num2) {
        if(num2 == 0){
            System.out.println("Não existe valor dividido por zero");
            return;
        }
            System.out.println(num1 / num2);
        }

        public void alteraDoisNUmeros(int num1, int num2){
           num1 = 99;
           num2 = 33;
            System.out.println("Dois numero");
            System.out.println("Num1" + num1);
            System.out.println("Num2 " + num2);
        }
    }

