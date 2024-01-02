package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data01 = LocalDate.now();
        System.out.println("olá a data de hoje é: DATA01 " + data01);

        LocalDateTime data02 = LocalDateTime.now();
        System.out.println("olá, agora são: DATA02 " + data02);

        Instant data03 = Instant.now();
        System.out.println("DATA03 " + data03);

        // texto para hora

        LocalDate data04 = LocalDate.parse("2024-01-01");
        System.out.println("DATA04 = " + data04);
        LocalDateTime data05 = LocalDateTime.parse("2024-01-01T19:30:20");
        System.out.println("DATA05 = " + data05);
        Instant data06 = Instant.parse("2024-01-01T19:30:20Z");
        System.out.println("DATA06 = " + data06);

        Instant data07 = Instant.parse("2024-01-01T19:30:20-03:00");
        System.out.println("DATA07 = " + data07);

        // texto customizado

        LocalDate date08 = LocalDate.parse("01/01/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("DATA08 = " + date08);

        // isolado
        LocalDate data10 = LocalDate.of(2024, 7, 2);
        System.out.println("DATA10 = " + data10);
        LocalDateTime data11 = LocalDateTime.of(2024, 12, 12, 22, 22, 22);
        System.out.println("DATA11 = " + data11);

      
    }

}
