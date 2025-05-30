package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a quantidade de copias que deseja: ");
        int copias = scanner.nextInt();

        if (copias <=10 ) {
            System.out.println("valor fica: " + copias * 0.10);
        } else if (copias <=50) {
            System.out.println("valor fica: " + copias * 0.08 + "R$");
        } else if (copias >50) {
            System.out.println("o valor fica: " + copias * 0.05 + "R$");
        }
    }
}

