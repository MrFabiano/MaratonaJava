package programer.primitivos;

public class TiposNumericos {

    public static void main(String[] args) {

        int num1 = 5, num2= 9, res;
        float res2;

        //Soma
        res = num1 + num2;
        System.out.println("A soma é " + num1 + " + " + num2 + " é= " +res);

        //Subtração
        res = num2 - num1;
        System.out.println("A subtraçao é " + num2 + " - " + num1 + " é= " +res);


        //DIvisao
        res = num2 / num1;
        System.out.println("A Divisao é " + num2 + " / " + num1 + " é= " +res);

        //Multiplicação
        res = num2 * num1;
        System.out.println("A Multiplicação é " + num2 + " * " + num1 + " é= " +res);

        //Divisão real
        res2 = num2 / num1;
        System.out.println("A Divisão é " + num2 + " / " + num1 + " é= " +res2);


    }
}
