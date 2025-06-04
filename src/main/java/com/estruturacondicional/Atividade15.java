package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso da sua encomenda em kg: ");
        double pesoEncomenda = scanner.nextDouble();

        System.out.println("Agora digite o tipo 1 de entrega para Sedex ou 2 Sedex 10: ");
        int tipo = scanner.nextInt();

        System.out.println("digite a regiao: 1 norte, 2 nordeste, 03 centro oeste, 4 sudeste, 5 sul: ");
        int regiao = scanner.nextInt();

        double valorTotal = 0.0;

        if (pesoEncomenda <=1 ) {
            valorTotal = 9;
        } else if (pesoEncomenda <= 5) {
            valorTotal = 10;
        } else {
            valorTotal = 15;
        }
        if (tipo == 1) {
            valorTotal = valorTotal + 9;
        } else {
            valorTotal = valorTotal + 11;
        } if (regiao==1) {
            valorTotal = valorTotal + 4;

        } else if (regiao==2) {
            valorTotal = valorTotal + 2;
        } else if (regiao==3) {
            valorTotal = valorTotal + 5;

        } else if (regiao==4) {
            valorTotal = valorTotal + 2;
        }else {
            valorTotal = valorTotal + 3;
        }
        System.out.println("o valor totsl do produto: " + valorTotal);

        }
    }






