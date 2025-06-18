package main.java.com.introducaobasica;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite o valor de X:");
         double x = scanner.nextDouble();

         String nome = scanner.nextLine();

         double y = (3 * x) + 2;
         System.out.println("O valor de Y na equação y=3x +2");
         System.out.println(y);
    }
}
