package main.java.com.estruturarepeticaofor;

import java.util.Scanner;
import java.util.SortedMap;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero * i);
        }
    }
}
