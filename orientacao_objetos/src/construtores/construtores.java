package construtores;

import entities.People;
import java.util.Scanner;

public class construtores {
    public static void main(String[] args) {

        // updates items.

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor me informe seu nome.");
        String name;
        int age;

        name = sc.nextLine();

        System.out.println("Por favor me informe sua idade.");
        age = sc.nextInt();

        People person = new People(name, age);

        System.out.println(person.getData());

        sc.nextLine();
        System.out.println("Altere o nome.");
        name = sc.nextLine();
        person.setName(name);

        System.out.println(person.getData());
        sc.close();
    }
}
