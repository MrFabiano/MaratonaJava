package logica.modificadorfinal;


public class Carro {

    private String nome;
    public static final Integer VELOCIDADE_MAXIMA = 250;
    public  final Comprador COMPRADOR = new Comprador();

    public  final void imprime(){
        System.out.println(this.nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "COMPRADOR=" + COMPRADOR +
                '}';
    }
}
