package main.java.com;

import java.util.Scanner;

public class Quadrado1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o priemiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("o resultado da multiplicação: ");
        System.out.println(primeiroNumero * segundoNumero);
        System.out.println(segundoNumero * primeiroNumero);

    }
}
