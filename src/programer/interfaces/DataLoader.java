package programer.interfaces;

public interface DataLoader {

     public static final int MAX_DATA_SIZE = 100;

     public abstract void load();

     public default void checkPermission(){
          System.out.println("Fazendo permissão de checagem");

     }

     public static void retrieveMaxDataSize(){
          System.out.println("Dentro do retrieve na interface");
     }
}
