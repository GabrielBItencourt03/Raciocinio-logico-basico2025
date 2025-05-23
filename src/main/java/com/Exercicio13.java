package main.java.com;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe valor e o percentual de desconto do produto: ");
        double valorProduto = scanner.nextDouble();
        double percentualDesconto = scanner.nextDouble();

        double valorFinal = valorProduto - (valorProduto * percentualDesconto / 100);
        System.out.println("seu valor final com desconto é: " + valorFinal);
    }
}
