package logica.arrays;

public class ArraysMultidemensionaisExer {

    public static void main(String[] args) {
        int[][] arrayMulti = new int[3][3];
        arrayMulti[0][0] = 22;
        arrayMulti[0][0] = 11;
        arrayMulti[0][0] = 4;
        arrayMulti[0][0] = 55;
        arrayMulti[0][0] = 9;
        arrayMulti[0][0] = 2;
        arrayMulti[0][0] = 5;
        arrayMulti[0][0] = 21;
        int resultado = 1;
        for (int i = 0; i < arrayMulti.length ; i++) {
            for (int j = 0; j <arrayMulti[i].length ; j++) {
                 if(i==j){
                     resultado = resultado * arrayMulti[i][j];
                 }
            }
            System.out.println(resultado);
        }
    }
}
