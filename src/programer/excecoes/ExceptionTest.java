package programer.excecoes;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {
            criarNovoArquivo();
    }

    public static void criarNovoArquivo(){
        File file = new File( "arquivo\\arquivo.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
