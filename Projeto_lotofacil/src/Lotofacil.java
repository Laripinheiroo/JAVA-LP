
import java.io.IOException;
import java.util.Scanner;

public class Lotofacil {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Aposta0a100.apostar0a100();
                    break;
                case 2:
                    ApostadeAaZ.apostarDeAaZ();
                    break;
                case 3:
                    ApostaPARouIMPAR.apostarParImpar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}
