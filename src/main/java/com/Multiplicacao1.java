package main.java.com;

import java.util.Scanner;

public class Multiplicacao1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("resultado da multiplicação: ");
        System.out.println(primeiroNumero * segundoNumero);
    }
}
