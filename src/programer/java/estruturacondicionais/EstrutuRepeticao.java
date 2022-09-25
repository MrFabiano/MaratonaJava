package programer.java.estruturacondicionais;

public class EstrutuRepeticao {

    public static void main(String[] args) {
        //while, do while, for
//
//        int count = 0;
//        while(count < 10){
//            System.out.println(count);
//            count++;
//        }
//
//        System.out.println("-----------------");
//
//        do {
//            System.out.println("dtro do while");
//        } while (count < 10);
//
//            }
//        }

//     int count = 100000;
//     while(count < 100000){
//         if (count % 2 == 0){
//             System.out.println("Imprima valores impares: " + count);
//         }
//     }
//
//        for(int i = 0; i <= 100000; i++){
//            if(i % 2 == 0){
//                System.out.println("Imprima este valores: " + i);
//            }
//        }
//
//        int valorMaximo = 50; //Imprimir valor ate 25
//        for (int i = 0; i <= valorMaximo; i++){
//            if( i > 25){
//                break;
//            }
//
//            System.out.println("Imprima " + i);
//        }
//    }
//}

        double valorCarro = 50000;
        for(int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if(valorParcela >= 1000){
                System.out.println("O Valor da parcela: " + parcela + " R$ " +valorParcela);
            } else {
                break;
            }
        }
    }
}


