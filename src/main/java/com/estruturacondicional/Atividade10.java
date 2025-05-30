package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Sem direito de voto.");
        } else if (idade <= 17) {
            System.out.println("Voto opcional");
        } else if (idade <= 60) {
            System.out.println("Voto obrigatorio");
        } else if (idade > 60) {
            System.out.println("Voto opcional");
        }
    }
}







