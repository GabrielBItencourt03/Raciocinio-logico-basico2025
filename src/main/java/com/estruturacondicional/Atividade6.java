package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros reais: ");
        int numeroReal1 = scanner.nextInt();
        int numeroReal2 = scanner.nextInt();

        if (numeroReal1 > numeroReal2 ) {
            System.out.println(numeroReal1 + " maior");
        }else if (numeroReal2 > numeroReal1) {
            System.out.println(numeroReal2 + " maior");
        }else if (numeroReal1 == numeroReal2) {
            System.out.println(numeroReal2 + " iguais");



}


    }
}


