package programer.orientacaoobjeto;

import programer.orientacaoobjeto.modificadoresacesso.Cliente;
import programer.orientacaoobjeto.modificadoresacesso.encapsulamento.Conta;

public class JavaObject {

    public static void main(String[] args) {

         Cliente cli =  new Cliente(20,"Carol", "Rua Bahia, 89");

         Cliente cl2 =  new Cliente(18,"Thalita", "Rua Acacia, 89");

         Conta c1 = new Conta(1, 200, 300, cli);
         Conta c2 = new Conta(2, 400, 500, cl2);

         System.out.println(c2.toString());

        Caixa caixa = new Caixa();


        if(c1.equals(c2)){
            System.out.println("Sao a mesma conta");
        } else{
            System.out.println("Contas diferentes");
        }

        caixa.adicionar(c1);
        caixa.adicionar(c2);

       // Conta conta = caixa.pegar(0);

        System.out.println(((Conta)caixa.pegar(0)).getSaldo());

        //caixa.adicionar(cli);

        System.out.println(((Conta)caixa.pegar(2)).getSaldo());

        if((Object)cli instanceof Conta){
            System.out.println("É UM OBJETO DO TIPO CONTA");
        } else{
            System.out.println("Não é um objto do tipo conta");
        }
    }
}
