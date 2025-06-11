package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade02  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 2 valores: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("Escolha seu tipo de calculo: (A) adição, (S) subtração, (M) multiplicação, (D) divisão");
        String calculo = scanner.nextLine();


        switch (calculo = scanner.nextLine()) {
            case "A":
                System.out.println("soma " + (n1 + n2));
                break;
            case "S":
                System.out.println("subtração " + (n1 - n2));
                break;
            case "M":
                System.out.println("multiplicação " + (n1 * n2));
                break;
            case "D":
                System.out.println("divisão " + (n1 / n2));
                break;
            default:
                System.out.println("calculo invalido");
        }
    }
}