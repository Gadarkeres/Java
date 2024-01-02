package primeiro_projeto.src.java;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        System.out.println("Olá mundo!");
        System.out.println("Ainda não sei muito de Java!"); // print() sem quebra de linha

        int idade = 20; // um número inteiro
        double data = 21.2212312; // um número decimal
        char sexo = 'F'; // um caractere (uma única letra)
        boolean aberto = true; // um valor lógico (verdadeiro ou falso)
        String nome = "Matheus"; // uma sequência de caracteres (uma string)

        System.out.printf("%.2f%n", data);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", data);

        System.out.println("sua idade é de " + idade + " " + "anos."); // misturando variaveis com escrita.
        System.out.printf("Sua idade é de %d anos. ", idade); // %d int %f float
        System.out.printf("Olá %s, vocÊ  tem %d anos e é do genero %c%n", nome, idade, sexo);

        // saida de dados

        
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.printf("Você digitou: %s%n", x);

        int number = sc.nextInt();
        sc.nextLine(); // consumindo quebra de linha com enter
        System.out.printf("Você digitou %d%n", number);

        // Agora você pode ler várias linhas sem problemas

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }

}
