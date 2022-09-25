package logica.programacao;
/*
Base de cálculo mensal, em R$	alíquota	parcela a deduzir do IR, em R$
        Até 1.903,98	isento	isento
        De 1.903,99 até 2.826,65	7,5%	142,80
        De 2.826,66 até 3.751,05	15%	354,80
        De 3.751,06 até 4.664,68	22,5%	636,13
        Acima de 4.664,68	27,5%	869,36

 */
public class ImpostoRenda {

    public static void main(String[] args) {
        double salario = 2350D;
        if(salario <= 1903.98){
            System.out.println("ISENTO");
        }else if (salario >= 1903.99 && salario <= 2826.65){
            System.out.println("7,5% " + (salario * 0.075));
        }else if(salario >= 2826.66 && salario <= 2751.05){
            System.out.println("15% " + (salario * 0.15));
        }else if(salario >= 3751.06 && salario <= 4664.68){
            System.out.println("22,5% " + (salario * 0.225));
        }else{
            System.out.println("27,5% " + (salario * 0.275));
        }
    }
}
