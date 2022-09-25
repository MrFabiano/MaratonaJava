package programer.enumeration;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("tuca", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente1 = new Cliente("firmino", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(200));
    }
}
