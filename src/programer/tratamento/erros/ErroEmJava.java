package programer.tratamento.erros;

public class ErroEmJava {

    public static void main(String[] args) {

        int [] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 3 * 2;
        }

        for (int i = 0; i <= numeros.length; i++) {
            try{
            System.out.println(numeros[i]);
        }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Voce esta tentando acessar uma posiçao que nao existe");
               // e.printStackTrace();
            }
        }
    }
}
/*
numeros[0] -> i = 0; 0 + 3 * 2 -> 6
numeros[1] -> i = 1; 1 + 3 * 2 -> 6
numeros[2] -> i = 2; 2 + 3 * 2 -> 6
numeros[3] -> i = 3; 3 + 3 * 2 -> 6
numeros[4] -> i = 4; 4 + 3 * 2 -> 6
 */