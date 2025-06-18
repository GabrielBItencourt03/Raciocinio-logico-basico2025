package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alunos = 0;
        int contador = 0;
        String sair = "N";

        while (!sair.equals("S") ){
            System.out.println("informe o nome dos alunos");
            String aluno = scanner.next();
            contador = contador + 1;
            System.out.println("Digite S para sair");
            sair = scanner.next();
        }
        System.out.println("quantidade de aluno: " + contador);
    }
}
