package programer.estruturadados.pilhas;

import java.util.Stack;

public class JavaPilhas {

    public static void main(String[] args) {

        Stack<String> nomes = new Stack<String>();
        System.out.println(nomes);
        nomes.push("Angelina");  //insere
        nomes.push("Joana");
        System.out.println(nomes);

        String ret = nomes.peek(); //reti=orna o elemento do topo
        System.out.println(ret);
        System.out.println(nomes);

       String r1 =  nomes.pop();  //remove
        System.out.println(r1);
        System.out.println(nomes);

    }
}
