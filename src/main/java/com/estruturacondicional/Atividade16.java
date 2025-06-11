package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o tempo na empresa");
        int tempo = scanner.nextInt();
        System.out.println("digite a função; 1 analista, 2 programador, 3 suporte ");
        int funcao = scanner.nextInt();
        System.out.println("digite a escolaridade: 2 para curso superior e 3 para pós graduação; ");
        int escolaridade = scanner.nextInt();

        int aumento = 0;

        if (tempo<5) {
            aumento = 2;
        } else if (tempo<=10) {
            aumento = 4;
        }else {
            aumento = 6;
        }
        if (funcao ==1 ) {
            aumento = aumento + 5;
        } else if (funcao==2) {
            aumento = aumento + 3;
        } else if (funcao==3) {
            aumento = aumento + 3;
        }
        if (escolaridade==2) {
            aumento = aumento + 7;
        } else if (escolaridade==3) {
            aumento=aumento+9;
        }
        System.out.println("o porcentual do aumento foi " + aumento);
    }
}


