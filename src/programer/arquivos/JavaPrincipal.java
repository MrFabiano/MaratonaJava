package programer.arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class JavaPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            PrintStream printStream = new PrintStream(new FileOutputStream("saida.txt", true));

            for(int i = 0; i < 5; i++){
                System.out.println("EScreva algo");
                String msg = scanner.nextLine();
                printStream.println(msg);
            }
        }catch(FileNotFoundException e){
            System.out.println("Não foi possivel criar o arquivo");
        }
        scanner.close();
    }
}

