package main.java.com.estruturarepeticaofor;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas você ira informar? ");
        int quantidadeNotas = scanner.nextInt();
         double soma = 0;

        for (int i = 1; i <= quantidadeNotas ; i++) {
            System.out.println("digite suas nota");
            double notas = scanner.nextDouble();
            soma = soma + notas;
        }
        System.out.println("Sua média sera: " + soma / quantidadeNotas  );
    }
}
