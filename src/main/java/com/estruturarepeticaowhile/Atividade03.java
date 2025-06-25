package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int contador = 0;
        int numero;
        int soma = 0;

        while (contador < 3) {
            System.out.println("Informe 10 numeros: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0){
               soma = soma + numero;
            }
            contador++;
        }
        System.out.println("a soma é: " + soma);
    }
}




