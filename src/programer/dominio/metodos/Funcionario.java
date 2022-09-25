package programer.dominio.metodos;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return this.media;
    }

    public void imprime() {
        System.out.println("-------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }
        for(double salario: salarios){
            System.out.println("salario " + salario + " ");
        }
    }

    public void mediaSalario() {
        System.out.println("-------------");
        if(salarios == null){
            return;
        }

       for(double salario: salarios){
           media += salario;
       }

        media /= salarios.length;
        System.out.println("Media salarial " + media);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Joao");
        funcionario.setIdade(34);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();
        System.out.println("Media: " + funcionario.getMedia());


        }
    }

