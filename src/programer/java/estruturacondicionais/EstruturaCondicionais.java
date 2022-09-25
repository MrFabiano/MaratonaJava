package programer.java.estruturacondicionais;

public class EstruturaCondicionais {

    public static void main(String[] args) {

        int idade  = 15;
        boolean isAutorizado = idade > 18;

        if(idade > 20){
            System.out.println("Maior de idade");
        }

        if(isAutorizado){
            System.out.println("Autorizado a comprar bebida alccolica");
        }
       if(!isAutorizado){  // é a mesma coisa isAutorizado == false em vez de fazer esta comparaçao usa-se "!"
           System.out.println("Naõ autorizado a comprar bebida alcoolica");
       }
    }
}
