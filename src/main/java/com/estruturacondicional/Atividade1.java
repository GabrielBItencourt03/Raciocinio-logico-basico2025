package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade1 {
    public static final int  MAIORIDADE = 18; //constante

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= MAIORIDADE) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("menor de idade");
        }
    }
}
