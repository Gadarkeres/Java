package primeiro_projeto.src.java;

import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        System.out.println("Por favor, informe a hora atual. EX: 15");

        int hour = hr.nextInt();

        if (hour > 6 && hour < 12) {
            System.out.println("Bom dia.");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Boa tarde.");
        } else {
            System.out.println("Boa noite.");
        }

        teste();
    }

    public static void teste() {
        int price = 10;
        System.out.println(price);
    }
}
