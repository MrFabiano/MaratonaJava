package logica.modificador.estatico;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    private double velocidadeLImite = 250;

    public void imprime(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLImite() {
        return velocidadeLImite;
    }

    public void setVelocidadeLImite(double velocidadeLImite) {
        this.velocidadeLImite = velocidadeLImite;
    }
}
