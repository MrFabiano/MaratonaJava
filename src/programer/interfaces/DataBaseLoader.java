package programer.interfaces;

public class DataBaseLoader implements DataLoader, DateRemover{

    @Override
    public void load() {
        System.out.println("Imprimindo dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieve na interface");
    }
}
