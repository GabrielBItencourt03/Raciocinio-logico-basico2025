package main.java.com;

import java.util.Scanner;

public class Divisao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite seu segundo numero: ");
        double segundoNumero = scanner.nextDouble();
        if (segundoNumero <= 0 ) {
        System.out.println("imposssivel ");{
             }
            System.out.println("resultado da Divisão é: ");
            System.out.println(primeiroNumero / segundoNumero);
            }
        }
    }