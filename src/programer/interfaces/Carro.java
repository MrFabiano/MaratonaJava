package programer.interfaces;

public class Carro implements IAutomotivo{

    private boolean ligado = false;

    @Override
    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
            System.out.println("Ligado o carro");
        }
    }

    @Override
    public void desligar() {
         if(this.ligado){
             this.ligado = false;
             System.out.println("Desligado o carro");
         }
    }
}
