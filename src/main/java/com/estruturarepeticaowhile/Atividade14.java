package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int b = scanner.nextInt();
        int contador= 1;
        int soma = 1;

        while (contador <= b){
            soma = soma * a;


            contador++;
        }
        System.out.println("A exponenciação do numero A por B é: " + soma);

    }
}
