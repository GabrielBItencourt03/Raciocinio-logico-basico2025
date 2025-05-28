package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero3 = scanner.nextDouble();

        double soma = numero1 + numero3;
        System.out.println("soma: " + soma);
        double subtracao = numero1 - numero3;
        System.out.println("subtração: " + subtracao);
        double multiplicacao = numero1 * numero3;
        System.out.println("multiplicação: " + multiplicacao);
        if (numero3 <= 0) {
            System.out.println("IMPOSSIVEL");
        } else {
            double div = numero1 / numero3;
            System.out.println("divisao: " + div);


        }
    }
}
