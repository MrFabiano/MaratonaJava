package programer.interfaces;

public class FileLoader implements  DataLoader, DateRemover{
    @Override
    public void load() {
        System.out.println("Imprimindo arquivo do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivo do banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieve na interface");
    }
}
