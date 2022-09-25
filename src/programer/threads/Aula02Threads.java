package programer.threads;

import programer.orientacaoobjeto.modificadoresacesso.Cliente;
import programer.orientacaoobjeto.modificadoresacesso.encapsulamento.Conta;

public class Aula02Threads {

    public static void main(String[] args) throws InterruptedException {

        Cliente cli = new Cliente(23, "Carla", "Rua 1");
        Conta conta = new Conta(1, 200, 300, cli);

        FazDeposito acao = new FazDeposito(conta);
        Thread thread = new Thread(acao);
        Thread thread1 = new Thread(thread);


        thread.start();
        thread1.start();

        thread.join(); //avisando que a thread deve se juntar a um sincronizdor
        thread1.join();

        System.out.println(conta);


    }
}
