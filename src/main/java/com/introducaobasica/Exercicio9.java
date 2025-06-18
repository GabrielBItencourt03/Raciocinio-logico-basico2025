package main.java.com.introducaobasica;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor d C: ");
        double c = scanner.nextDouble();


        if (a == 0) {
            System.out.println("o VALOR DE ZERO NAO PODER SER DIVIDO");
        } else {

            double resultado = (Math.pow(b, 2) - 4 * a * c) / (2 * a);
            System.out.println("Seu resultado é: " + resultado);
         }
        }
    }
