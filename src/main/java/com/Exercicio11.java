package main.java.com;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("quantos km percorrido: ");
        double kmPercorrido = scanner.nextDouble();

        System.out.println("Me diga quanto tempo levou : ");
        double horaPercorrido = scanner.nextDouble();
        if (horaPercorrido <= 0) {
            System.out.println("Impossivel");
        }else{


            System.out.println(nome + " sua media percorrida é de " );
            System.out.println(kmPercorrido/horaPercorrido + " km");
        }

        }
    }


