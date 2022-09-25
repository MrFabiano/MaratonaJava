package programer.collections;

import programer.orientacaoobjeto.modificadoresacesso.Cliente;
import programer.orientacaoobjeto.modificadoresacesso.encapsulamento.Conta;

import java.util.HashMap;
import java.util.Map;

/*
HashMap = implementa a interface map e atua com chave/valor
 */
public class JavaHashMap {

    public static void main(String[] args) {
        Map<String, Conta> contas = new HashMap<String, Conta>();


        Cliente cli = new Cliente(18, "Joana", "Rua 1");

        Cliente cli2 = new Cliente(45, "Pedro", "Rua 2");

        Conta co = new Conta(1, 200, 400, cli);

        Conta co2 = new Conta( 2, 300, 500, cli2);

        contas.put("Pessoa Fisica", co);
        contas.put("Pessoa Juridica", co2);

        System.out.println(contas.size());

        System.out.println(contas.get("Pessoa Fisica"));

    }
}
