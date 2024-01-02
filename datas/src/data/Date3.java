package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date3 {
    public static void main(String[] args) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // converter hora global para local
        LocalDate data24 = LocalDate.parse("2024-01-20");
        LocalDateTime data25 = LocalDateTime.parse("2024-01-01T22:22:22");
        Instant data26 = Instant.parse("2024-01-01t22:22:22Z");
        // convertendo o instant para o local date.
        LocalDate r1 = LocalDate.ofInstant(data26, ZoneId.systemDefault()); 
        // LocalDate r2 = LocalDate.ofInstant(data26, ZoneId.of("Portugal")); 

        System.out.println("r1 = " + formater.format(r1));
        // System.out.println("r2 = " + formater.format(r2));


        System.out.println("dia do data24 = " + data24.getDayOfMonth());
        System.out.println("Hora do dia data25 = " + data25.getHour());

        



    }
}
