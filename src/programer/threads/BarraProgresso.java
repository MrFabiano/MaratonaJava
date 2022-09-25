package programer.threads;

public class BarraProgresso implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + "Gerando barra de progresso..");
        }
    }
}