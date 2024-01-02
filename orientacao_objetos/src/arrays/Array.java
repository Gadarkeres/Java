package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int p = 10;
        System.out.println(p);

 // exemplo sem usar constructos

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];
       

        for(int i = 0; i  < n; i ++){
            System.out.println("INFORME A ALTURA: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){
                sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("altura media é: %.2f%n", avg);
        sc.close();
    }
}
