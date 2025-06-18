package main.java.com.introducaobasica;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("me diga a quantidade de dias: ");
        int dias = scanner.nextInt();
        System.out.println("me diga a quantidade de horas: ");
        int horas = scanner.nextInt();
        System.out.println("me diga a quantidade de minutos: ");
        int minutos = scanner.nextInt();
        System.out.println("agora me diga a quantidade de segundos: ");
        int segundos = scanner.nextInt();



        int totalSegundos = (dias * 86400) + (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("REsultado final em segundos é: " + totalSegundos);


    }
}
