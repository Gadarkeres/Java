package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
    public static void main(String[] args) {
  
  
        for(int i = 0; i < 100; i++){
            System.out.printf("%d desculpa %n.", i);
        }

        // sem orientação objetos

        Triangle x,y;

        x = new Triangle();
        y = new Triangle();


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Envie as medidas do triangulo X: ");
        x.a = sc.nextFloat();
        x.b = sc.nextFloat();
        x.c = sc.nextFloat();


        // for(int i = 0; i < 100; i++){
        //     System.out.printf("%d%n. desculpa", i);
        // }


        System.out.println("Agora envie as medidas do triangulo Y: ");

        y.a = sc.nextFloat();
        y.b = sc.nextFloat();
        y.c = sc.nextFloat();

        float areaX = (float) x.calculateArea();


        float areaY = (float) y.calculateArea();

        System.out.printf("a medida do triangulo X é de %f%.4f%n", areaX);
        System.out.printf("a medida do triangulo Y é de %f%.4f%n", areaY);
        sc.close();

    }


}
