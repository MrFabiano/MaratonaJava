package programer.vetores;

public class Vetores02 {

    public static void main(String[] args) {

                  //Declaração e tamnho do vetor
        int [] numeros = new int[10];

        System.out.println("Tamanho do vetor" + numeros.length);

        for (int i = 0; i < numeros.length; i++){
            //numeros[0] = i + 3;
            numeros[0] = i + 3;
           // numeros[9] = i + 3;
        }

        System.out.println(numeros[0]); //primeiro elemento
        System.out.println(numeros[9]); //ultimo elemento

        numeros[0] = 7;
        System.out.println(numeros[0]); //primeiro elemento

        //numeros[0] = 23.4f; os vetores possuem  dados fixos e nao aceitam tipos variados

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int) Math.round(Math.random() * 10);
        }

        System.out.println(numeros[0]); //primeiro elemento
        System.out.println(numeros[9]); //ultimo elemento

        //0...1 double
        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println(Math.round(Math.random() * 10));

        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
