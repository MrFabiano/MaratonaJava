package programer.staticos;

/*
Metodos estaticos

um metodo estatico não depende de uma instancia de classe para ser utilizado
- pode se utilizar conforme

NomeDaClasse.metodo()
 */
public class JavaPrograma {

    public static void main(String[] args) {
        Conta c1 = new Conta("Roberto");
        System.out.println(c1.getCliente());
        System.out.println(c1.getCliente());

        System.out.println("A proxima conta sera: " + Conta.proximaConta());
        //System.out.println(c1.proximaConta);

    }



}
