package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Teste1 {

    final static int INFANTIL = 7;
    final static int JUVENIL = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 13;

        if (idade <= INFANTIL) {
            System.out.println("infantil");
        } else if (idade <= JUVENIL) {
            System.out.println("Juvenil");
        }else{
            System.out.println("faixa não encontrada");


    }
    }
}
