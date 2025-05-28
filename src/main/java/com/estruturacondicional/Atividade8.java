package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade8 {
    final static int UNIDADE = 9;
    final static int DEZENA = 99;
    final static int CENTENA = 999;
    final static int MILENIO = 1000;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero <= 9) {
            System.out.println("Seu numero é unidade");
        } else if (numero <= 99) {
            System.out.println("seu numero é dezena");
        } else if (numero <= 999){
            System.out.println("seu numero e centena");
        }
    }
}
