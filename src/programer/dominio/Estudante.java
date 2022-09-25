package programer.dominio;

public class Estudante {
    public int idade;
    public String nome;
    public char sexo;

    public void imprime(){
        System.out.println("================");
        System.out.println(this.idade);
        System.out.println(this.nome);
        System.out.println(this.sexo);
    }

        public static void main (String[]args){
            Estudante estudante = new Estudante();
            Estudante estudante2 = new Estudante();
            //ImpressoraEstudante impressora = new ImpressoraEstudante();

            estudante.idade = 30;
            estudante.nome = "Joana";
            estudante.sexo = 'F';

            estudante2.idade = 33;
            estudante2.nome = "Roco";
            estudante2.sexo = 'M';

            estudante.imprime();
            estudante2.imprime();


        }
    }



