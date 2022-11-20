package programer.heranca;

public class Funcionario extends Pessoa{

    private Double salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public Funcionario(String nome) {
        super(nome);
    }


    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
