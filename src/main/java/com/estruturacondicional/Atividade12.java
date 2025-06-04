package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três numeros: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();


        if ((n1 == n2) || (n2 == n3) || (n1 == n3)) {
            System.out.println("numeros iguais não são validos.");
        } else {
            if ((n1 > n2) && (n1 > n3)) {
                System.out.println("o numero maior é: " + n1);
            } else if ((n2 > n1) && (n2 > n3)) {
                System.out.println("o numero maior é: " + n2);
            } else if ((n3 > n1) && (n3 > n2)) {
                System.out.println("o numero maior é: " + n3);
            }
        }
    }
}
