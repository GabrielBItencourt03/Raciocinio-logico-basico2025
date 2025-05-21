package main.java.com;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto ");
        String nome = scanner.nextLine();

        System.out.println("digite o valor de compra");
        double precoCompra = scanner.nextDouble();
        System.out.println("digite o preço de venda");
        double precoVenda = scanner.nextDouble();
        double lucro = precoVenda - precoCompra;

        System.out.println("E seu lucro é de: " + lucro );

    }
}
