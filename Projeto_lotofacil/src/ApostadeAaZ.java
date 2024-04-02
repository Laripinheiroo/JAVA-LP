import java.io.IOException;

public class ApostadeAaZ {
    public static void apostarDeAaZ() throws IOException {
        System.out.print("Digite uma letra de A a Z: ");
        char letraApostada = (char) System.in.read();

        if (Character.isLetter(letraApostada)) {
            letraApostada = Character.toUpperCase(letraApostada);
            char letraPremiada = 'J'; // Suponha que 'J' seja a letra premiada

            if (letraApostada == letraPremiada) {
                System.out.println("Você ganhou R$ 500,00 reais.");
            } else {
                System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
            }
        } else {
            System.out.println("Aposta inválida.");
        }
    }
}
