package programer.datas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate anoNovo = LocalDate.of(2023, Month.JANUARY, 1);
        System.out.println(anoNovo);

        int ano = anoNovo.getYear();
        Month mes = anoNovo.getMonth();
        int dia = anoNovo.getDayOfMonth();

        System.out.println("A ano novo sera: " + dia + " de " + mes + " de " + ano);

        Period period = Period.between(hoje, anoNovo);
        System.out.println(period);

        System.out.println("Faltam " + period.getYears() + " anos " + period.getMonths() + " meses e " + period.getDays() + " dia para ano novo");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatter));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        DateTimeFormatter formatadorAgora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(agora.format(formatadorAgora));

        LocalTime intervalo = LocalTime.of(9, 30);
        System.out.println(intervalo);
    }
}
