package programer.abstrata;

public class FuncionarioTest {

    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("julio", 222.0);
        Gerente gerente = new Gerente("Namu", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Fabiano", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
