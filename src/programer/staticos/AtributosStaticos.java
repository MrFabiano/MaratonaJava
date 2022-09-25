package programer.staticos;
/*
Atributos staticos = sao atributos onde os valores sao compartilhados entre as instancias de classe
 */
public class AtributosStaticos {

    public static void main(String[] args) {
        Conta conta = new Conta( "Joao");
        System.out.println("Clinte: " + conta.getCliente());
        System.out.println("Numero: " + conta.getNumero());

        Conta conta1 = new Conta( "Maria");
        System.out.println("Clinte: " + conta1.getCliente());
        System.out.println("Numero: " + conta1.getNumero());

        Conta conta2 = new Conta( "Joana");
        System.out.println("Clinte: " + conta2.getCliente());
        System.out.println("Numero: " + conta2.getNumero());

        System.out.println(Conta.contador);

        Conta.contador = 42;

        Conta conta3 = new Conta( "Outro cliente");
        System.out.println(conta3.getCliente());
        System.out.println(conta3.getNumero());

    }
}
