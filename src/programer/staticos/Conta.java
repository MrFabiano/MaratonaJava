package programer.staticos;

public class Conta {

    private int numero;
    private String cliente;

    public static int contador = 1;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Conta(String cliente) {
        this.numero = contador;
        this.cliente = cliente;
        Conta.contador = Conta.contador + 1;


    }

    public static int proximaConta(){
        return Conta.contador;
    }
}

