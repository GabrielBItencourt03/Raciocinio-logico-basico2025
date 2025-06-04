package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite 2 numeros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
      double positivo = +0.0;
      double negativo = -0.0;
      double conta = n1-n2;
      if (n1==0) {
          System.out.println("Z");
      } else if (n2==0) {
          System.out.println("Z");
      } else if ((n1>=positivo ) && (n2>=positivo)) {
          System.out.println("M");
      } else if ((n1<=negativo) && (n2<=negativo)) {
            System.out.println("M");
      } else if (n1!=n2) {
          System.out.println("O");

      }
    }
}

