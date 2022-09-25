package programer.estruturadados.pilhas;

/*
São estruturas de dados onde o elemento que está visivel/disponível é o que está sempre no topo

para remover elementos da pilha só podemos remover o topo

[4] = topo
[3]
[2]
[1]
[0]
 */
public class Pilhas {

    public static void main(String[] args) {

    Pilha pilha = new Pilha();

        System.out.println(pilha);

        pilha.insere("Joana");
        System.out.println(pilha);
        pilha.insere("Roberta");
        System.out.println(pilha);

        String ret = pilha.pegaTopo();
        System.out.println(ret);

        String r1 = pilha.remove();
        System.out.println(r1);

        System.out.println(pilha);

        pilha.remove();
        System.out.println(pilha.vazia());

    }
}
