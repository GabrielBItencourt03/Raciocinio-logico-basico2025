package main.java.com;

import java.util.Scanner;

public class soma1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo Numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("O Resultado da soma é: ");
        System.out.println(primeiroNumero + segundoNumero);


    }
}
