package programer.defaultmethods;

public interface Teste {

    int valor = 9;

    public String mensagem();

    default void meu_metodo(){
        System.out.println("Default method");
    }
}
