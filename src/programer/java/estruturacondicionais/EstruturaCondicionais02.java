package programer.java.estruturacondicionais;

public class EstruturaCondicionais02 {

    public static void main(String[] args) {
        // idade < 15 infantil
        // idade >= 15 && idade < 18 juvenil
        // idade > 18 adulto

        int idade = 20;
        String categoria;

        if(idade > 20){
            categoria = "Categoria infantil";
        } else if(idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);

    }
}
