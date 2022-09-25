package programer.heranca;

public class Endereco {

    private String rua;
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }



    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("2545435");
        endereco.setRua("RUA 1");

        Pessoa pessoa = new Pessoa("JUlio");
        pessoa.setIdade("13");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("--------------");


        Funcionario funcionario = new Funcionario("JUca");
        funcionario.setIdade("12");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10.000);

        funcionario.imprime();


    }
}
