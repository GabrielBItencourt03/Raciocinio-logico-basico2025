package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero1 * numero2);
        }
    }
}
