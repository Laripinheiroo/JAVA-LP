import java.util.Random;
import java.util.Scanner;

public class Aposta0a100 {
    public static void apostar0a100() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite um número de 0 a 100: ");
        int numeroApostado = scanner.nextInt();

        if (numeroApostado < 0 || numeroApostado > 100) {
            System.out.println("Aposta inválida.");
        } else {
            int numeroSorteado = random.nextInt(101); // Gera um número aleatório de 0 a 100
            if (numeroApostado == numeroSorteado) {
                System.out.println("Você ganhou R$ 1.000,00 reais.");
            } else {
                System.out.println("Que pena! O número sorteado foi: " + numeroSorteado);
            }
        }

        scanner.close();
    }
}

