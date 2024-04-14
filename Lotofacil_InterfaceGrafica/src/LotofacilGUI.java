import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LotofacilGUI extends JFrame {
    private JLabel labelInstrucao;
    private JTextField textFieldAposta;
    private JButton buttonEnviar;

    public LotofacilGUI() {
        // Configurações da janela
        setTitle("Lotofácil");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Label de instrução inicial
        labelInstrucao = new JLabel("Menu LOTOFÁCIL:\n" +
                "1) Apostar de 0 a 100 \n" +
                "2) Apostar de A à Z \n" +
                "3) Apostar em par ou ímpar: ");
        add(labelInstrucao);

        // Campo de texto para a escolha do tipo de aposta
        textFieldAposta = new JTextField(10);
        add(textFieldAposta);

        // Botão para enviar a escolha
        buttonEnviar = new JButton("Enviar");
        add(buttonEnviar);

        // ActionListener para o botão de enviar
        buttonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Processa a escolha do tipo de aposta
                String escolha = textFieldAposta.getText();
                if (escolha.equals("1")) {
                    labelInstrucao.setText("Faça sua aposta de 0 a 100:");
                    buttonEnviar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Processa a aposta de 0 a 100
                            int aposta = Integer.parseInt(textFieldAposta.getText());
                            Random random = new Random();
                            int numeroSorteado = random.nextInt(101);
                            if (aposta == numeroSorteado) {
                                JOptionPane.showMessageDialog(LotofacilGUI.this, "Você ganhou R$ 1.000,00 reais.");
                            } else {
                                JOptionPane.showMessageDialog(LotofacilGUI.this, "Que pena! O número sorteado foi: " + numeroSorteado);
                            }
                        }
                    });
                } else if (escolha.equals("2")) {
                    labelInstrucao.setText("Faça sua aposta de A a Z:");
                    buttonEnviar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Processa a aposta de A a Z
                            char letraApostada = textFieldAposta.getText().toUpperCase().charAt(0);
                            char letraPremiada = 'J'; // Suponha que 'J' seja a letra premiada
                            if (letraApostada == letraPremiada) {
                                JOptionPane.showMessageDialog(LotofacilGUI.this, "Você ganhou R$ 500,00 reais.");
                            } else {
                                JOptionPane.showMessageDialog(LotofacilGUI.this, "Que pena! A letra sorteada foi: " + letraPremiada);
                            }
                        }
                    });
                } else if (escolha.equals("3")) {
                    labelInstrucao.setText("Faça sua aposta de PAR ou ÍMPAR:");
                    buttonEnviar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Processa a aposta de PAR ou ÍMPAR
                            int aposta = Integer.parseInt(textFieldAposta.getText());
                            if (aposta % 2 == 0) {
                                JOptionPane.showMessageDialog(LotofacilGUI.this, "Você ganhou R$ 100,00 reais.");
                            } else {
                                JOptionPane.showMessageDialog(LotofacilGUI.this, "Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                            }
                        }
                    });
                }
            }
        });
    }

    public static void main(String[] args) {
        // Criando e exibindo a janela
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LotofacilGUI lotofacilGUI = new LotofacilGUI();
                lotofacilGUI.setVisible(true);
            }
        });
    }
}
