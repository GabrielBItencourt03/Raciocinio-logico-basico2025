package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Escreva sua 3 notas: ");
        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();

        double soma = (nota1 + nota2 + nota3) / 3;
        if (soma >= 7) {
            System.out.println("passado e sua media é: " + soma + " aluno " + nome);
        }else{
            if (soma < 7);
            System.out.println("Reprovado e sua media é: " + soma + " aluno " + nome);
        }




    }
}
