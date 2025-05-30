package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três numeros: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();


        if ((n1 > n2) && (n1 > n3)) {
            System.out.println("primeiro numero é maior que os outros dois.");
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("o segundo numero é maior que os outros dois");
        } else if ((n3 > n1) && (n3 > n2)) {
            System.out.println("o terceiro numero é maior que os outros dois");
        }
    }
}
