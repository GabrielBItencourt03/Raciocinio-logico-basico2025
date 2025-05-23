package main.java.com;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a temperatura em grau celsius: ");
        double grauCelsius = scanner.nextDouble();
        double div = (grauCelsius * 9/5 + 32);

        System.out.println("Seu resultado em fahrenheit: " + div);



    }
}
