package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade7 {

    final static int INFANTIL = 10;
    final static int JUVENIL = 17;
    final static int ADULTO = 18;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade <= 10) {
            System.out.println("Você é infantil");
        } else if (idade <= 17) {
            System.out.println("Voce e juvenil");
        } else {
            if (idade >= 18) {
                System.out.println("Voce é adulto");

            }
        }
    }
}
