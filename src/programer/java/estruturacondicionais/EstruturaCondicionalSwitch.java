package programer.java.estruturacondicionais;

public class EstruturaCondicionalSwitch {

    public static void main(String[] args) {

        //Imprima o dia da semana, consideran 1 como domingo
//        int dia = 6;
//
//        switch (dia){
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda-Fera");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            case 7:
//                System.out.println("Sabado");
//                break;
//            default:
//                System.out.println("Opção invalida");
//
//        }
//
//    }
        ////////////////////////////
        int diaUtil = 3;
        switch (diaUtil) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}

