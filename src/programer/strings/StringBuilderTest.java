package programer.strings;

public class StringBuilderTest {

    public static void main(String[] args) {
        String nome = "Fabiano Teixeira ";
        nome.concat("Analista de Sistemas ");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Fabiano Teixeira ");
        sb.append("Analista ").append("Sistemas ");
        sb.reverse();
        sb.reverse();
        //sb.delete(0,3);
        System.out.println(sb);

    }
}
