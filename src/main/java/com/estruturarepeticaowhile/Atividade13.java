package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int termo = scanner.nextInt();
        System.out.println("Digite a razão:");
        int razao = scanner.nextInt();
        int contador = 0;

        while (contador < 10){
            System.out.println(termo);
            termo = termo * razao;
            contador++;
        }
    }
}
