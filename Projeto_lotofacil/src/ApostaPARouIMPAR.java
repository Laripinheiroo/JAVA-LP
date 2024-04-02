import java.util.Scanner;

public class ApostaPARouIMPAR {
    public static void apostarParImpar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroApostado = scanner.nextInt();

        if (numeroApostado % 2 == 0) {
            System.out.println("Você ganhou R$ 100,00 reais.");
        } else {
            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
        }

        scanner.close();
    }
}

