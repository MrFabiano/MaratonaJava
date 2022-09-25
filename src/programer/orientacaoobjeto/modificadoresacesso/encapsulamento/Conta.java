package programer.orientacaoobjeto.modificadoresacesso.encapsulamento;

import programer.orientacaoobjeto.modificadoresacesso.Cliente;

public class Conta {

    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getSaldo() {
        return this.saldo + this.limite;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public Conta(){}

    public void sacar(float valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo  - valor;
            System.out.println("Saque efetuado com sucesso");
        } else if(valor <= this.saldo + this.limite){
            //calculando o valor excedente do saque
            //100 - 200 = -100
            float val_ret = this.saldo - valor;
            if(val_ret < 0){
                this.saldo = 0;
            }
            val_ret = this.limite + val_ret;
            this.limite = val_ret;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
   public  void depositar(float valor) {
       synchronized (this) {
           this.saldo = this.saldo + valor;
       }
   }

    @Override
    public String toString() {
       // return "O saldo da conta é " + this.saldo + " Limite " + this.limite;
        return "O saldo da conta é " + this.getSaldo() + " Limite " + this.getLimite();

    }

    //instanceof = pergunta se é uma instancia da outra
    public boolean equals(Object obj){
        if(!(obj instanceof Conta)){
            return false;
        }else {
            Conta verificar = (Conta) obj;
            return verificar.getSaldo() == this.getSaldo();
        }
    }
}
