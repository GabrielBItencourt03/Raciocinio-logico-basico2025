import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva 3 números:");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();

        double menor, medio, maior;

        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                medio = n2;
                maior = n3;
            } else {
                medio = n3;
                maior = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                medio = n1;
                maior = n3;
            } else {
                medio = n3;
                maior = n1;
            }
        } else {
            menor = n3;
            if (n1 <= n2) {
                medio = n1;
                maior = n2;
            } else {
                medio = n2;
                maior = n1;
            }
        }
        System.out.println("Ordem crescente:");
        System.out.println(menor);
        System.out.println(medio);
        System.out.println(maior);
    }
}

