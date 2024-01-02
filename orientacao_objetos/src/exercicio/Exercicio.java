package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rend[] rooms = new Rend[10];

        System.out.println("Quantos quartos serão alugados?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();

            System.out.println("Quarto#" + i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Quarto: ");
            int roomNumber = sc.nextInt();
            rooms[roomNumber] = new Rend(name, email);

        }
        System.out.println();

        System.out.println("Quartos alugados:");
        for (int i = 0; i < 10; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " +  rooms[i]);
            }
        }

    }
}
