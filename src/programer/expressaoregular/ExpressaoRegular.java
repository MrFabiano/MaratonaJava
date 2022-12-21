package programer.expressaoregular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

    public static void main(String[] args) {
        /*
       // \d = todos os digitos
       // \D = tudo o que não for digito
       // \s = espaços em branco \t \n \f \r
       // \S = todos os caracteres excluindo os brancos
       // \w = a-ZA-Z, digitos
       // \W tudo o que não for incluso no \w
        // [] = ranger, busca de acordo o que esta incluso no []
       //  ? zero ou uma
       //  * zero ou mais
       //  + uma ou mais
        // {n,m} de n ate m
        // ()
        // |
        // $
        // 1.3 = 123, 133, 1@3, 1A3
         */

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto" +texto);
        System.out.println("indice 0123456789");
        System.out.println("regex" + regex);
        while (matcher.find()){
            System.out.println(matcher.start()+ " " +matcher.group()+"\n");
        }
    }
}
