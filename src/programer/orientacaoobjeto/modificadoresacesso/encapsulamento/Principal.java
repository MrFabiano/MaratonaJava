package programer.orientacaoobjeto.modificadoresacesso.encapsulamento;

import programer.orientacaoobjeto.modificadoresacesso.Cliente;

public class Principal {

    public static void main(String[] args) {


        Cliente joao = new Cliente(39,"Joao da silva", "Rua da Paz 45");
        Cliente maria = new Cliente(37,"Maria da silva", "Rua da Paz 45");

        Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);

        Conta conta_maria = new Conta(2, 300.0f, 400.0f, maria);

        System.out.println("Saldo do maria: " + conta_maria.getSaldo());

        System.out.println("------------------------------------------");

        System.out.println("Saldo antes do saque: " + conta_joao.getSaldo());
        conta_joao.sacar(150);
        System.out.println("Saldo do joão depois de aumentar o limite forçado: " + conta_joao.getSaldo());



    }
}
