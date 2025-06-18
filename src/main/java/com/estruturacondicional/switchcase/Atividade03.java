package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escreva 3 numeros: ");
        int X = scanner.nextInt();
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double maior = 0;
        double menor = 0;

        double resultado = 0.0;
        switch (X){
            case 1:
                System.out.println(A+B);
                break;
            case 2:
                System.out.println(A/B);
                break;
            case 3:
               if (A > B) maior = A;
                else menor = A;
                if (B>A) maior = B;
                else menor = A;

                System.out.println(maior+ "," +menor);
                break;

            case 4:
                if (A>B){
                    System.out.println("A diferença é" + (A-B));
                } else System.out.println("A diferença é " + B+A);

                break;

            case 5:
                resultado = (A+B)/2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("erro");
        }
    }
}

