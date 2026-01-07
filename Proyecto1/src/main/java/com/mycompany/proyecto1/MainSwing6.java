package com.mycompany.proyecto1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainSwing6 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gestión de Personas");
            frame.setContentPane(new Panel6());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
