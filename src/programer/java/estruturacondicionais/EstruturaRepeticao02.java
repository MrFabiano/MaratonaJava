package programer.java.estruturacondicionais;

public class EstruturaRepeticao02 {

    public static void main(String[] args) {

        double valorCarro = 50000;

        for(int parcela = (int) valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("O Valor da parcela: " + parcela + " R$ " +valorParcela);
        }
    }
}


