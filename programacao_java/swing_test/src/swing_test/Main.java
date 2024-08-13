package swing_test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Janela feita com Swing
        JFrame frame = new JFrame("Test Java Qbex");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Componentes da tela
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Exibir Texto");
        JLabel label = new JLabel("");

        // Define a ação do botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                label.setText("Você digitou: " + text);
            }
        });

        // Adiciona os componentes ao painel
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        panel.add(label);

        // Adiciona o painel à janela
        frame.add(panel);

        // Torna a janela visível
        frame.setVisible(true);
    }
}
