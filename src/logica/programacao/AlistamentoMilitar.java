package logica.programacao;

public class AlistamentoMilitar {

    public static void main(String[] args) {
        char sexo = 'M';
        int idade = 10;

        if((sexo == 'M' || sexo == 'F') && sexo < 18 ){

        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento obrigatorio");

        }else if (sexo == 'F' && idade >= 18){
            System.out.println("Alistamento obrigatorio");
        } else {
            System.out.println("Alistamento não obrigatorio");
        }
    }
}
