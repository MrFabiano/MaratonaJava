package programer.arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//lendo arquivos
public class LendoArquivos {
    public static void main(String[] args) {
        Scanner scanner;
        {
            try {
                scanner = new Scanner(new FileInputStream("entrada.txt"));
                while (scanner.hasNextLine()) {
                    String linha = scanner.nextLine();
                    System.out.println(linha);
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado");
            }
        }
    }
}