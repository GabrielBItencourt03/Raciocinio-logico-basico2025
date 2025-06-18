package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira o tema o livro: 1: ficção" +
                "2: Não Ficção" +
                " 3: Romance" +
                " 4: Terror" +
                " 5: Mistério");
        int livro = scanner.nextInt();
        switch (livro){
            case 1:
                System.out.println("o livro a categoria de Ficçao");
                break;
            case 2:
                System.out.println(" o livro pertecnce a categoria de não ficção");
                break;
            case 3:
                System.out.println("o livro pertence a categoria de romance");
            case 4:
                System.out.println("o livro pertence a terror");
            case 5:
                System.out.println("o livro pertence a categoria de misterio");
            break;
            default:
                System.out.println("livro não catologado");
        }
    }
}
