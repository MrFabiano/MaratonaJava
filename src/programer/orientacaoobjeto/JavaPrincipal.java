package programer.orientacaoobjeto;

import programer.orientacaoobjeto.modificadoresacesso.Cliente;
import programer.orientacaoobjeto.modificadoresacesso.encapsulamento.Conta;

import java.util.Scanner;

public class JavaPrincipal {

    static Cliente cliente = new Cliente(20,"Juliana", "Rua da paz 87");
    static Conta conta = new Conta(3456, 200, 500, cliente);
    static Scanner scanner = new Scanner(System.in);

    public static void depositar(){
        System.out.println("=============Deposito==========");
        System.out.println("Informe o valor do deposito");
        float valor = scanner.nextFloat();
        if(valor > 0){
            conta.depositar(valor);
            System.out.println("Deposito efetuado com sucesso");
        } else {
            System.out.println("O valor precisa ser positivo");
        }
    }

    public static void sacar(){
        System.out.println("=============Saque==========");
        System.out.println("Informe o valor do saque");
        float valor = scanner.nextFloat();
        if(valor > 0){
            conta.sacar(valor);
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("O saque precisa ser positivo");
        }
    }

    public static void consultar(){
        System.out.println("Consulta do saldo do cliente" + conta.getSaldo());
    }

    public static void main(String args[]){
        int opcao = 0;
        System.out.println("Bem vindo ao sistema financeiro");

        do{
            System.out.println("Selecione uma opçao a baixo");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    depositar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                      consultar();
                      break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }
        } while (opcao > 0);
        scanner.close();
            {
        }
    }
}
