package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAIORIDADE = 18;

        double idade = 15;

        if (idade > MAIORIDADE) {
            System.out.println("maior  de idade");
        } else if (idade == MAIORIDADE) {
            System.out.println("idade iguala 18 anos");
        }else{
            System.out.println("menor de idade");

        }
    }
}
