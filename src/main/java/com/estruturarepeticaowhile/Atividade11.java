package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int mutiplicacao = 1;

        while (contador < 20) {
            if (contador % 2 == 0){
                mutiplicacao = mutiplicacao * contador;
            }
            contador ++;
            }
        System.out.println(mutiplicacao);
        }
    }

