package programer.estruturadados;

public class EStruturaDados {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Angelina");
        Aluno alun1 = new Aluno("Maria");

        Vetor lista = new Vetor();

        System.out.println("Total de alno: " + lista.tamanho());

        lista.adiciona(aluno);
        System.out.println("Total de alno: " + lista.tamanho());

        lista.adiciona(alun1);
        System.out.println("Total de alno: " + lista.tamanho());

        System.out.println(lista);


        System.out.println(lista.contem(aluno));

        try{
        System.out.println(lista.pega(0));
    }catch (IllegalArgumentException e){
            System.out.println("Aluno da posição nao existe" + e.getMessage());
        }

        Aluno a3 = new Aluno("Fernanda");
        try{
            lista.adiciona(1, a3);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        lista.remove(0);
        System.out.println(lista);
    }

}
