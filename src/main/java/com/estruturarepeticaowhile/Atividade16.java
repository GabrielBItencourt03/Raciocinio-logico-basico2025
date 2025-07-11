package main.java.com.estruturarepeticaowhile;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Atividade16 {
    private static int QUANTIDADE = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double maiorCompra = 0;
        double somaTodasCompras = 0;

        while(contador < QUANTIDADE){
            System.out.println("Digite seu valor de compra:");
            double valorCompra = scanner.nextDouble();
            if (contador == 0){
                maiorCompra = valorCompra;
            }
            if (valorCompra > maiorCompra){
                maiorCompra = valorCompra;
            }
             somaTodasCompras = somaTodasCompras + valorCompra;
             contador++;
        }
        System.out.println("maior numero: " + maiorCompra);
        double media = somaTodasCompras /QUANTIDADE;
        System.out.println("a media: " + media);
    }
}
