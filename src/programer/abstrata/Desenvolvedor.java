package programer.abstrata;

public class Desenvolvedor extends Funcionario{


    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);

    }

    public void calcularBonus(){
        this.salario = this.salario + this.salario * 0.10;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
