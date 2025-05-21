package main.java.com;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 numeros: ");
        double primeiroNumero = scanner.nextDouble();
        double segundoNumero = scanner.nextInt();
        double terceiroNumero = scanner.nextDouble();

        double soma = (primeiroNumero + segundoNumero + terceiroNumero);
        double div = (soma / 3);
        System.out.println("seu resultado da media arimética é: " + div);



    }
}
