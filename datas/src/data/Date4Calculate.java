package data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Date4Calculate {
    public static void main(String[] args) {;
        LocalDate data24 = LocalDate.parse("2024-01-20");
        LocalDateTime data25 = LocalDateTime.parse("2024-01-01T22:22:22");
        Instant data26 = Instant.parse("2024-01-01t22:22:22Z");

        // calculos com data hora. // frete
        LocalDate data24WeekPLUS = data24.plusDays(5);
        System.out.println(data24WeekPLUS);
  
        LocalDate data24WeekMinus = data24.minusDays(7);
        System.out.println(data24WeekMinus);

        LocalDateTime data25WeekPLUS = data25.plusDays(5);

        Instant data26WeebPLUS = data26.minus(7, ChronoUnit.DAYS);



        // ---------------------------------------------------------------
        // duração com time
        Duration t1 = Duration.between(data25, data25WeekPLUS);
        System.out.println(t1.toDays());

        // converter o local date pate local date time
        Duration t2 = Duration.between(data24.atStartOfDay(), data24WeekPLUS.atStartOfDay());
        System.out.println("t2 dias: " + t2.toDays());

    }
}
