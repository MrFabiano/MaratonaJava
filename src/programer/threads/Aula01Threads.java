package programer.threads;

public class Aula01Threads {

    public static void main(String[] args) {
        BarraProgresso barraProgresso = new BarraProgresso();
        Thread thread = new Thread(barraProgresso);
        thread.start();

        System.out.println("-------------------------------");

        GeraRelatorio geraRelatorio = new GeraRelatorio();
        Thread thread1 = new Thread(geraRelatorio);
        thread1.start();

    }
}
