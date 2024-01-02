package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date2 {
    public static void main(String[] args) {
        // transformar data para texto

        LocalDate data21 = LocalDate.parse("2024-01-20");
        LocalDateTime data22 = LocalDateTime.parse("2024-01-01T22:22:22");
        Instant data23 = Instant.parse("2024-01-01t22:22:22z");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "dd/MM/yyyy");
        DateTimeFormatter formaterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formaterInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault());

        System.out.println("D21 = " + data21.format(formatter));

        System.out.println("D21 = " + formatter.format(data21));
        System.out.println("D22 = " + formaterTime.format(data22));

        System.out.println("D23 = " + formaterInstant.format(data23));


    }
}
