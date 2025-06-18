package main.java.com.introducaobasica;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo numero");
        double segundoNumero = scanner.nextDouble();

        double soma = primeiroNumero + segundoNumero;
         double media = soma/2;

         System.out.println("a media é " + media);
    }
}
