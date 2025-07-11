package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int quantidadeNumerosPares = 0;
        int quantidadeNumerosImpares = 0;
        int somaNumerosImpares = 0;
        int maiorNumero = 0;

        while (contador < 10) {
            System.out.println("Digite um numero:");
            int numero = scanner.nextInt();
            if ((contador == 0) || (numero > maiorNumero)) {
                maiorNumero = numero;
            }
            if (numero % 2 == 0) {
                quantidadeNumerosPares++;
            } else {
                quantidadeNumerosImpares++;
                somaNumerosImpares = somaNumerosImpares + numero;
            }
            contador++;
        }
        System.out.println("quantidade de numeros pares: " + quantidadeNumerosPares);
        double media = (double) somaNumerosImpares / quantidadeNumerosImpares;
        System.out.println("media de numeros impares: " + media);
        System.out.println("Maior numero: " + maiorNumero);
        if (quantidadeNumerosPares > quantidadeNumerosImpares){
            System.out.println("numeros pares apareceu com maior frêquencia");
        } else {
            System.out.println("Numeros impares apareceu com mais frêquencia");
        }
    }
}
