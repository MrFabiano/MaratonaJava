package logica.programacao;

public class JavaSwithCase {

    public static void main(String[] args) {

        String conta = "CONTA POUPANÇA";
        switch (conta){
            case "CONTA POUPANÇA":
                System.out.println("0.05% " + "CONTA POUPANÇA");
                break;
            case "CONTA CORRENTE":
                    System.out.println("0.02% " + "CONTA CORRENTE");
                    break;
            case "CONTA INVESTIMENTO":
                System.out.println("0.1% "+ "CONTA INVESTIMENTO");
                break;
            default:
                System.out.println("CONTA INEXISTENTE");
        }
    }
}
